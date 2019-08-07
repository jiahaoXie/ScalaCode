package scala05

/**
  * view bounds:作为一种上下边界Bounds的加强版，支持可以对类型进行隐式转换，
  * 将指定的类型进行隐式转换后，再判断是否在边界指定的类型范围内
  * @author xjh 2018.11.3
  */
object fanxing04 {
  class Person(val name: String) {
    def sayHello = println("Hello, I am " + name)
    def makeFriend(p: Person): Unit = {
      sayHello
      p.sayHello
    }
  }
  class Student(name: String) extends Person(name)
  class Dog(val name: String){
    def sayHello=println("Dog ,Dog's name is "+name)
  }
  implicit def dog2person(obj:Object):Person={
    //这里进行隐式转换 将dog类型的转换为Person类型的
    if( obj.isInstanceOf[Dog]){
      val dog=obj.asInstanceOf[Dog]
      new Person(dog.name)
    }else new Person(" ")
  }
  class  Party[T <% Person](p1:T,p2:T){   //注意这里的view bounds用的是 <%
    def play = p1.makeFriend(p2)
  }
  def main(args: Array[String]): Unit = {
    val s1=new Student("xjh")
    val d1=new Dog("jj")
    val party=new Party(s1,d1)
    s1.makeFriend(d1)
  }
}
