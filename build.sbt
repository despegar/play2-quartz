organization := "mchv"

name := """play2-quartz"""

version := "1.1.1"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= List(
	"org.quartz-scheduler" % "quartz" % "2.2.2"
)

publishTo := {
      if(version.value.endsWith("SNAPSHOT"))
        Some("Nexus snapshots" at "http://nexus.despegar.it:8080/nexus/content/repositories/snapshots/")
      else
        Some("Nexus releases" at "http://nexus.despegar.it:8080/nexus/content/repositories/releases/")
}