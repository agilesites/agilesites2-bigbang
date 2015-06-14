#!/bin/sh
SBT_OPTS="-Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"
if test -z "$SBT_JAVA"
then echo "Please set SBT_JAVA"; exit 1
fi
if test -z "$SBT_REPO"
then echo "Please set SBT_REPO"; exit 1
fi
"$SBT_JAVA" $SBT_OPTS -Dsbt.ivy.root="$SBT_REPO" -jar `dirname $0`/sbt-launch.jar "$@"
