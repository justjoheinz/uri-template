name := "uri-template"

organization := "no.arktekk"

scalaVersion := "2.11.0"
    
crossScalaVersions := Seq("2.11.0", "2.10.4")

libraryDependencies := {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, scalaMajor)) if scalaMajor >= 11 =>
      libraryDependencies.value ++ Seq(
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"
      )
    case _ =>
      // or just libraryDependencies.value 
      libraryDependencies.value
  }
}

libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "2.1.4" % "test"
)
