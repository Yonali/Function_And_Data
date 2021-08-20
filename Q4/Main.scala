object question_04 extends App{

	val acc1= new Bankacc("harry",12030,10000.00)
	val acc2= new Bankacc("Hat",12040,-3000.00)
  val acc3= new Bankacc("Jacob",12030,10000.00)
	val acc4= new Bankacc("Maal",12040,3000.00)

  var bank:List[Bankacc]=List(acc1,acc2,acc3,acc4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Bankacc])=>b.map((x) => (x.nic,x.accnumber,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))

  println(overdraft)
  println(balance)
  println(interest(bank))

}

class Bankacc(id:String,n:Int,b:Double){

  var nic:String=id
  var accnumber:Int =n
  var balance:Double =b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

}