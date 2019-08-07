package scala05

/**
  * 上下边界Bounds
  * @author xjh 2018.11.13
  */
object fanxing03 {

  class Person(val name: String) {
    def sayHello = println("Hello, I am " + name)

    def makeFriend(p: Person): Unit = {
      sayHello
      p.sayHello
    }
  }

  class Student(name: String) extends Person(name)

  class Dog(val name: String)

  class Party[T <: Person](p1: T, p2: T) {
    //<:表示上边界 这里T<:Person 表示Person为泛型T的上边界 T只能为Person类或者其子类
    def play = p1.makeFriend(p2)
  }

  def getIdcard[R >: Student](person: R): Unit = {       //>:下边界
    if (person.getClass == classOf[Student]) println("Tell me your father")
    else if (person.getClass == classOf[Person]) println("OK,Alright")
    else println("error")
  }

  def main(args: Array[String]): Unit = {
    val s1 = new Student("Jack")
    val s2 = new Student("Kobe")
    val p1 = new Person("Tompson")
    val d1 = new Dog("qw")

    val party = new Party(s1, s2)
    party.play
    val party2 = new Party(s1, p1)
    party2.play
    //    val party3=new Party(s1,d1)         //因为Dog不是Person的子类 所以这里会报错
    //    party3.play

    getIdcard(s1)
    getIdcard(p1)
    getIdcard(d1)

  }
}
