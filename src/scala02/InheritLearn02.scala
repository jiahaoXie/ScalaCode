package scala02

/**
  * 子类调用父类的constructor构造器方法
  * Scala中，每个类可以有一个主constructor和任意多个辅助constructor，而每个辅助constructor的第一行都必须是调用其他辅助constructor或者是主constructor；
  * 因此子类的辅助constructor是一定不可能直接调用父类的constructor的。
    只能在子类的主constructor中调用父类的constructor，以下这种语法，就是通过子类的主构造函数来调用父类的构造函数
    注意！如果是父类中接收的参数，比如name和age，子类中接收时，就不要用任何val或var来修饰了，否则会认为是子类要覆盖父类的field
  * @author xjh 2018.11.08
  */
class Person02(var name: String,var age:Int)
  //这里需要对Person类主构造方法中的参数及逆行显示的声明 常量或者变量
class Student02 (name:String,age:Int,var score:Double) extends Person02(name,age){
  def this(name: String)=this(name,18,85)
  def this(age: Int)=this("xjh",age,100)
  def getPro(): Unit ={
    println("name :"+name+" age: "+age+" score: "+score)
  }
}
object InheritLearn02 {
  def main(args: Array[String]): Unit = {
    val s1=new Student02("kobe")
    s1.getPro()
  }
}
