import scala.annotation.tailrec
import scala.util.{Failure, Success}
import org.parboiled2._

object Main extends App {
  repl()

  @tailrec
  def repl(): Unit = {
    print("---\nEnter expression for parser > ")
    Console.out.flush()
    readLine() match {
      case "" ⇒
      case line ⇒
        val parser = new ABCParser(line)
        parser.InputLine.run() match {
          case Success(_)             ⇒ println("Expression is valid")
          case Failure(e: ParseError) ⇒ println("Expression is not valid: " + parser.formatError(e))
          case Failure(e)             ⇒ println("Unexpected error during parsing run: " + e)
        }
        repl()
    }
  }
}
