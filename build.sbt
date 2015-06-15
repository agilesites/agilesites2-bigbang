val bb = project.in(file(".")).enablePlugins(AgileSitesPlugin)

name := utilPropertyMap.value.getOrElse("sites.focus", "bigbang")

organization := utilPropertyMap.value.getOrElse("organization", "org.agilesites")

version := utilPropertyMap.value.getOrElse("version", "0.1-SNAPSHOT")

ivyConfigurations += config("tomcat")

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-core" % "11.1.1.8.0_11g-M1-SNAPSHOT",
  "com.sciabarra" % "agilesites2-build" % "11g-M1-SNAPSHOT" % "tomcat"
    extra("scalaVersion" -> "2.10", "sbtVersion" -> "0.13"))

unmanagedBase := file(sitesWebapp.value) / "WEB-INF" / "lib"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
