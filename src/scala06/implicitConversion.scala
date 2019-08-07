package scala06

/**
  * 隐式转换
  * 要实现隐式转换，只要程序可见的范围内定义隐式转换函数即可。Scala会自动使用隐式转换函数。
  * 隐式转换函数与普通函数唯一的语法区别就是，要以implicit开头，而且最好要定义函数返回类型。
  * @author xjh 2018.11.13
  */
object implicitConversion {
  class SpecialPerson(val name: String)
  class Student(val name: String)
  class Older(val name: String)

  implicit def object2SpecialPerson (obj: Object): SpecialPerson = {
    if (obj.getClass == classOf[Student]) { val stu = obj.asInstanceOf[Student]; new SpecialPerson(stu.name) }
    else if (obj.getClass == classOf[Older]) { val older = obj.asInstanceOf[Older]; new SpecialPerson(older.name) }
    else new SpecialPerson(" ")
  }

  var ticketNumber = 0
  def buySpecialTicket(p: SpecialPerson) = {
    ticketNumber += 1
    "T-" + ticketNumber
  }

  def main(args: Array[String]): Unit = {
    val s1=new Student("Jack")
    val s2=new Student("Commid")
    val p1=new Older("Tom")
    println(buySpecialTicket(s1))
  }
}
