// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.1"
// That is, to create a valid sbt build, all you've got to do is define the
// version of Scala you'd like your project to use.

// ============================================================================

// name := "hello-world"
// organization := "ch.epfl.scala"
// version := "1.0"

libraryDependencies ++= Seq(
  "org.processing" % "core" % "3.0b5",
  "org.processing" % "net" % "3.0b5",
  "org.processing" % "video" % "3.0b5",
  "org.processing" % "serial" % "3.0b5",
  "org.processing" % "pde" % "3.0b5",
  "org.processing" % "pdf" % "3.0b5")

// ============================================================================

// Most moderately interesting Scala projects don't make use of the very simple
// build file style (called "bare style") used in this build.sbt file. Most
// intermediate Scala projects make use of so-called "multi-project" builds. A
// multi-project build makes it possible to have different folders which sbt can
// be configured differently for. That is, you may wish to have different
// dependencies or different testing frameworks defined for different parts of
// your codebase. Multi-project builds make this possible.


// To learn more about multi-project builds, head over to the official sbt
// documentation at http://www.scala-sbt.org/documentation.html
