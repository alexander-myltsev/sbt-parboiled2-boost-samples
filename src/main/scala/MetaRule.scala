import org.parboiled2._

class MetaRule(val input: ParserInput) extends Parser {

def expression = rule { "foo[" ~ ab ~ "]..foo[" ~ cd ~ "].." }

def ab = rule { "ab" }

def cd = rule { "cd" }

}
