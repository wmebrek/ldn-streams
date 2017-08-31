name := "ldn-streams"
organization := "ch.hevs"
version := "1.0.2"
scalaVersion := "2.12.3"
  
libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "joda-time" % "joda-time" % "2.9.9",
  "ch.hevs" %% "rdf-tools" % "0.1.1",
  "org.apache.jena" % "apache-jena-libs" % "3.1.0",
  "com.typesafe.akka" %% "akka-http" % "10.0.7", 
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.7",
  "de.heikoseeberger" %% "akka-sse" % "3.0.0",
  "com.github.jpcik" % "cqels" % "1.2.2",
  "com.github.jpcik.CSPARQL-engine" % "csparql-core" % "0.9.9",
  "net.sourceforge.owlapi" % "owlapi-api" % "4.0.0",
  "net.sourceforge.owlapi" % "owlapi-apibinding" % "4.0.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "junit" % "junit" % "4.12" % "test"
)

resolvers ++= Seq(
  "typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.sonatypeRepo("public"),
  "jitpack" at "https://jitpack.io"
)


EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

scalacOptions ++= Seq("-feature","-deprecation")

enablePlugins(JavaAppPackaging)
