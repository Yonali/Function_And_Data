object q2 extends App{

val x = new rational(3,4)
val y = new rational(5,8)
val z = new rational(2,7)
val r= x-y-z

println(r)
}

class rational(m:Int,d:Int){
require(d>0,"d > 0")
def numer=m/gcd(math.abs(m),d)
def denom=d/gcd(math.abs(m),d)
def this(m:Int)=this(m,1)
private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
def +(r:rational) = new rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom)
def neg = new rational(-this.numer,this.denom)

def -(r:rational) = this + r.neg
override def toString = numer + "/" + denom

}