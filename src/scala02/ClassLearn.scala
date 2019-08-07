package scala02

/**
  * 类的简单使用
  * @author xjh 2018.10.16
  */
object ClassLearn {

  class Counter {
    var value = 0 //这里类的成员属性没有定义属性 默认情况为public

    def increment(step:Int):Unit = {
      value +=step
    }

    def current(): Int = value
  }

  def main(args: Array[String]): Unit = {
    val counter = new Counter
    counter.increment(5)
    println(counter.current())
  }
}
