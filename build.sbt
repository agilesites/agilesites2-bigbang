enablePlugins(AgileSitesNgPlugin)

name := utilPropertyMap.value.getOrElse("sites.focus", "BigBang")

organization := utilPropertyMap.value.getOrElse("organization", "org.agilesites") 

version := utilPropertyMap.value.getOrElse("version", "1.0")

libraryDependencies ++= Seq(
    "com.sciabarra" % "agilesitesng-lib"  % "11g-M3" % "run;compile",
    "com.sciabarra" % "agilesites2-build" % "11g-M3" % "run;compile"
      extra("scalaVersion" -> "2.10", "sbtVersion" -> "0.13")
)  

unmanagedBase := file(sitesWebapp.value) / "WEB-INF" / "lib"


resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

resolvers ++= Seq(Resolver.sonatypeRepo("releases"),
  "Nexus-sciabarra-releases" at "http://nexus.sciabarra.com/content/repositories/releases",
  "Nexus-sciabarra-snapshots" at "http://nexus.sciabarra.com/content/repositories/snapshots")
