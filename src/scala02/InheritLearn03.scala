package scala02

/**
  * 匿名子类（Scala中的匿名子类等价于Java中的匿名内部类）
  * 匿名子类，也就是说，可以定义一个类的没有名称的子类，并直接创建其对象，然后将对象的引用赋予一个变量。
  * 之后甚至可以将该匿名子类的对象传递给其他函数。
  * @author xjh 2018.11.08
  */

object InheritLearn03 {
  class  People(protected var name: String){
    def sayHello="Hello , I'm "+name
  }
  def main(args: Array[String]): Unit = {
    val p=new People("xjh"){  //new关键字 创建一个对象（Person类或者Person类的子类）
      override def sayHello: String = super.sayHello+" ,I come from China"
          //override关键字 表明这里是继承上面Person类的方法
    }
    println(p.sayHello)

  }
}
