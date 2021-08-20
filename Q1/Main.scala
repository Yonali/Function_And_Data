object Q1 extends App{

val num = new Rational(9,4)
println(num.neg)
}

class Rational(m:Int,n:Int){
def numer=m
def denom=n

def neg = new Rational(-this.numer,this.denom)
override def toString = numer + "/" + denom

}
