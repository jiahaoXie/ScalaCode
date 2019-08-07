package scala02

/**
  * 为实例混入trait
  * 有时我们可以在创建类的对象时，指定该对象混入某个trait，
  * 这样，就只有这个对象混入该trait的方法，而类的其他对象则没有
  *
  * @author xjh 2018.11.08
  */
object TraitLearn03 {

  trait Log {
    def log(msg: String){}
      //编程时注意 这必须加上大括号 表示该方式实现了 非抽象方法
  }

  trait MyLog extends Log {
    override def log(msg: String) = println("log: " + msg)
  }

  class Per(val name: String) extends Log {
    def sayHello: Unit = {
      print("Hi, I'm " + name+"; ")
      log("12345")
    }
  }

  def main(args: Array[String]): Unit = {
    val p1 = new Per("xjh")
    p1.sayHello
    println()
    val p2 = new Per("kobe") with MyLog //这里with MyLog指的是对象p2混入trait MYLog
    p2.sayHello
  }
}
