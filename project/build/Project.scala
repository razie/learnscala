import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {

  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
  //val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2.credentials", log)
      
  val SCALAVER = "2.8.1"
    
  val scalatest  = "org.scalatest" % "scalatest" % "1.2"
  val junit      = "junit" % "junit" % "4.5" % "test->default"
}

