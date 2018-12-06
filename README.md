```
$> sbt 'set scalaVersion := "2.12.6"' 'set version := s"0.0.1-SNAPSHOT"' publishLocal
[success] Total time: 3 s, completed Dec 6, 2018 11:13:26 AM
$> javap -classpath target/scala-2.12/classes T
Compiled from "A.scala"
public final class T {
  public static java.lang.String f();
  public static java.lang.Object f();
}
$> sbt 'set scalaVersion := "2.12.8"' 'set version := s"0.0.2-SNAPSHOT"' mimaReportBinaryIssues
[success] Total time: 3 s, completed Dec 6, 2018 11:13:43 AM
$> javap -classpath target/scala-2.12/classes T
Compiled from "A.scala"
public final class T {
  public static java.lang.String f();
}
```