package scala02

/**
  * 给类中的字段设置值以及读取值。
  * 在Java中，这是通过getter和setter方法实现的。
  * 在Scala中，也提供了getter和setter方法的实现,但是并没有定义成getXxx和setXxx。
  * 在Scala中，可以通过定义类似getter和setter的方法，分别叫做value和value_=
  * @author xjh 2018.10.16
  */
object ClassLearn02 {
  class Test{
    private var testValue=0
    def value=testValue //定义一个方法，方法的名称就是原来我们想要的字段的名称
    def value_=(newValue:Int): Unit ={
      if(newValue>0) testValue=newValue
    }
    def increment(step:Int): Unit ={
      value+=step
    }
    def current(): Int ={
      value
    }
  }
  def main(args: Array[String]): Unit = {
    val test=new Test
    println(test.value)   //打印value的初始值
    test.value=3          //为value设置新的值
    println("new :"+test.value)
    test.increment(10)    //这里设置步长为10，每次增加10
    println(test.current())
  }
}
