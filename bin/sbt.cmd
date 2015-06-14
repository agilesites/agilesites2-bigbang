set SBT_DIR=%~dp0
if "%SBT_JAVA%"=="" goto err
if "%SBT_REPO%"=="" goto err
"%SBT_JAVA%" -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M -Dsbt.ivy.root="%SBT_REPO%" -jar "%SBT_DIR%\sbt-launch.jar" %*
goto end
:err
echo Missing SBT_JAVA or SBT_REPO
:end