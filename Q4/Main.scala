object question_04 extends App{

	val Account1= new Bankacc("Malith",10001,10000.00)
	val Account2= new Bankacc("Mevan",10002,-3000.00)
        val Account3= new Bankacc("Hasaranga",10003,10000.00)
	val Account4= new Bankacc("Dilini",10004,3000.00)

  var bank:List[Bankacc]=List(Account1,Account2,Account3,Account4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Bankacc])=>b.map((x) => (x.customer,x.Accno,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))

  println(overdraft)
  println(balance)
  println(interest(bank))

}

class Bankacc(name:String,t:Int,b:Double){

  var customer:String=name
  var Accno:Int =t
  var balance:Double =b

  override def toString = "\t"+customer+"_"+Accno+"\t-> "+balance

}