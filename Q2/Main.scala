object q2 extends App{

val x = new Rational(3,4)
val y = new Rational(5,8)
val z = new Rational(2,7)
val r= x-y-z

println(r)
}

class Rational(m:Int,d:Int){
require(d>0,"d must be greater than 0")
def numer=m/gcd(math.abs(m),d)
def denom=d/gcd(math.abs(m),d)
def this(m:Int)=this(m,1)
private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
def +(r:Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
def neg = new Rational(-this.numer,this.denom)

def -(r:Rational) = this + r.neg
override def toString = numer + "/" + denom

}