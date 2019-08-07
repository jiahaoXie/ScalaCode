package scala02

/**
  * Object继承抽象类
  * @author xjh 2018.11.07
  */
abstract  class Hello(var message:String){
    //这里必须个message加上var声明 表示它是一个变量,如果没有声明 下面的对象sayHello的输出语句中message就会报错
  def sayHello(name:String)
}
object HelloVar extends Hello("hello"){
  override def sayHello(name: String): Unit = println(message+", "+name)
}
object ObjectLearn04 {
  def main(args: Array[String]): Unit = {
    HelloVar.sayHello("xjh")
  }
}
