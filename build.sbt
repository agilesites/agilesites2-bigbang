name := "bigbang"

organization := "com.sciabarra"

version := "0.1-SNAPSHOT"

enablePlugins(AgileSitesPlugin)

ivyConfigurations += config("tomcat")

libraryDependencies ++= Seq(
  "com.sciabarra" % "agilesites2-build" % "11g-M1-SNAPSHOT" % "tomcat"
    extra("scalaVersion" -> "2.10", "sbtVersion" -> "0.13"))

unmanagedBase := file(sitesWebapp.value) / "WEB-INF" / "lib"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java
