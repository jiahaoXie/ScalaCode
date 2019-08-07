package scala02

/**
  * trait继承class
  *在Scala中，trait也可以继承自class，此时这个class就会成为所有继承该trait的类的父类
  * @author xjh 2018.11.08
  */
object TraitLearn05 {
class MyUtil{
  def printMessage(msg:String)=println(msg)
}
  trait LoUtil extends MyUtil{
    def log(msg:String)=printMessage(" Trait log: "+msg)
  }
  class Prere(val name:String) extends LoUtil{
    def sayHello: Unit ={
      log("Hi, I'm "+name)
      printMessage("Hi,I'm "+name)
    }
  }

  def main(args: Array[String]): Unit = {
    val p=new Prere("jiahao")
    p.sayHello
  }
}
