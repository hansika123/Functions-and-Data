
  object Q1 extends App {
    val r1 = new Rational2(2,3)
    val r2 = new Rational2(4,7)
    println(r1.neg)
    println(r2.neg)
  }

  class Rational2(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def neg = new Rational2(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
  }

