object Q3 extends App{

	val Account1= new Bankacc("Malith",1001,5000.00)
	val Account2= new Bankacc("Mevan",1002,3000.00)

  Account1.transfer(Account2,500.00)
  println("\nDisplay balances After proccess")
  println("_________________________________")
  println(Account1)
  println(Account2)


}

class Bankacc(name:String,x:Int,b:Double){

  var customer:String=name
  var Accno:Int =x
  var balance:Double =b

	def withdraw(x:Double){
		this.balance=this.balance-x
	}

	def deposit(x:Double){
		this.balance=this.balance+x
	}

	def transfer(account:Bankacc,x:Double)={
    this.withdraw(x)
    account.deposit(x)
  }

  override def toString = "\t"+customer+"_"+Accno+"\t-> "+balance

	};object Q1 extends App{

val num = new Rational(9,4)
println(num.neg)
}

class Rational(m:Int,n:Int){
def numer=m
def denom=n

def neg = new Rational(-this.numer,this.denom)
override def toString = numer + "/" + denom

}
