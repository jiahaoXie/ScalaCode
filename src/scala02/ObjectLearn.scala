package scala02

/**
  * Object简单使用
  *
  * @author xjh 2018.11.07
  */
object Person11{
  private var num=10
  println("this person object!")
  def getNum=num
}
object ObjectLearn {
  def main(args: Array[String]): Unit = {
    println(Person11.getNum)
    println(Person11.getNum)
  }
}
