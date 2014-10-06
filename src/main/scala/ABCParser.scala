import org.parboiled2._

class ABCParser(val input: ParserInput) extends Parser {

def InputLine = rule { &(A ~ "c") ~ oneOrMore("a") ~ B ~ !("a" | "b" | "c") ~ EOI }

def A: Rule0 = rule { "a" ~ optional(A) ~ "b" }

def B: Rule0 = rule { "b" ~ optional(B) ~ "c" }

}
