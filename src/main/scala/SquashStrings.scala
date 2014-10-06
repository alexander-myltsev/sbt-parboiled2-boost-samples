import org.parboiled2._

class SquashStrings(val input: ParserInput) extends Parser {

def InputLine = rule { "abce" | "gf" | "k" | optional("abc") }

}
