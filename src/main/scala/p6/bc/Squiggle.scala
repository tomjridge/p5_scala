package p6.bc

object Squiggle {
  case class ~[+a, +b](_1: a, _2: b) {
    override def toString = "(" + _1 + "~" + _2 + ")"
  }
}