enablePlugins(AgileSitesNgPlugin)

name := utilPropertyMap.value.getOrElse("sites.focus", "bigbang")

organization := utilPropertyMap.value.getOrElse("organization", "org.agilesites") 

version := utilPropertyMap.value.getOrElse("version", "1.0")

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % 
     "11.1.1.8.0_11g-M1-SNAPSHOT" % "core;compile"
   , "com.sciabarra" % "agilesites2-api" %
     "11.1.1.8.0_11g-M1-SNAPSHOT" % "api;compile"
  , "com.sciabarra" % "agilesites2-build"
    % "11g-M1-SNAPSHOT" % "run;compile"
    extra("scalaVersion" -> "2.10", "sbtVersion" -> "0.13")
  , "com.oracle" % "sites-support" % "4.1" % "populate"
  )

unmanagedBase := file(sitesWebapp.value) / "WEB-INF" / "lib"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
