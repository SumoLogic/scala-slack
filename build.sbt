name := "scala-slack"

organization := "com.flyberrycapital"

version := "0.3.2-SUMO-1"

scalacOptions += "-target:jvm-1.8"

scalaVersion := "2.11.12"

crossScalaVersions ++= Seq("2.11.12", "2.12.11", "2.13.3")

// Publish settings

publishMavenStyle := true

// HOWTO:
// 1. Go to our repo
// 2. get to packages
// 3. There's a "setup" section where you can select SBT and it'll get you going
publishTo := {
   val nexus = "https://oss.sonatype.org/"
   if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
   else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))

homepage := Some(url("https://github.com/flyberry-capital/scala-slack"))

pomExtra := (
   <scm>
      <url>git@github.com:flyberry-capital/scala-slack.git</url>
      <connection>git@github.com:flyberry-capital/scala-slack.git</connection>
   </scm>
      <developers>
         <developer>
            <id>ksolan</id>
            <name>Kyle Solan</name>
            <url>https://github.com/ksolan</url>
         </developer>
      </developers>)



libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.4"

libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.4.2"

libraryDependencies += "org.mockito" % "mockito-core" % "1.8.5" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"
