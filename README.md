# learnscala
scala exercises - just one example, a small DSL to simulate a linux rm command:

```scala
package razie.learn.dsl.fs1

case class Flag (val c:Char) 
object r extends Flag('r')
object f extends Flag('f')

class Cmd_rm (var flags:List[Flag]) { 
  def - (f:Flag) = { flags = f :: flags; this }
  def apply (s:String) = "removing " + s
}

trait Commands {
  def rm = new Cmd_rm (Nil)
}

object CmdOptions extends Application with Commands {
  rm -r -f apply "gigi.file"

  (((rm) - r) - f) apply "gigi.file"
  rm.-(r).-(f).apply("gigi.file")
}
```
