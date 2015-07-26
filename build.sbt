enablePlugins(AgileSitesNgPlugin)

name := utilPropertyMap.value.getOrElse("sites.focus", "bigbang")

organization := utilPropertyMap.value.getOrElse("organization", "org.agilesites") 

version := utilPropertyMap.value.getOrElse("version", "1.0")

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % 
     "11.1.1.8.0_11g-M1-SNAPSHOT" % "core;compile"
   , "com.sciabarra" % "agilesites2-api" %
     "11.1.1.8.0_11g-M1-SNAPSHOT" % "api;compile"
   // incremental annotation processing support
   , "com.sciabarra" % "agilesites2-build"
      % "11g-M2-SNAPSHOT" % "run;compile"
      extra("scalaVersion" -> "2.10", "sbtVersion" -> "0.13")
   //, "com.typesafe.akka"   %% "akka-actor"   % "2.3.9" % "compile"
   //, "com.typesafe.akka"   %% "akka-remote"  % "2.3.9" % "compile"
   //, "com.typesafe.akka"   %% "akka-slf4j"   % "2.3.9" % "compile"
)  // , "com.oracle" % "sites-support" % "4.1" % "populate"


unmanagedBase := file(sitesWebapp.value) / "WEB-INF" / "lib"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
