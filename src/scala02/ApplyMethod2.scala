package scala02

/**
  * apply在伴生对象即相对应的类中的简单运用
  * @author xjh 2018.10.17
  */
class ApplyTest{
  def apply() = println("apply method in class is called!")
  def test: Unit ={
    println("Greeting method in class is called.")
  }
}
object ApplyTest{
  def apply() = {
    println("apply method in object is called")
    new ApplyTest()
  }
}

object ApplyMethod2 {
  def main(args: Array[String]): Unit = {
    val a = ApplyTest() //这里会调用伴生对象中的apply方法
    a.test
    a() // 这里会调用伴生类中的apply方法
  }
}
