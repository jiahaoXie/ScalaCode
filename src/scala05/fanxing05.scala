package scala05

/**
  * Context Bounds
  * Context Bounds是一种特殊的Bounds，它会根据泛型类型的声明，比如“T: 类型”要求必须存在一个类型为“类型[T]”的隐式值。
  * 其实个人认为，Context Bounds之所以叫Context，是因为它基于的是一种全局的上下文，需要使用到上下文中的隐式值以及注入。
  * @author xjh 2018.11.13
  */
object fanxing05 {
  class Calculator[T:Ordering](val n1:T,val n2:T){
    def max(implicit order:Ordering[T]):T={
      if(order.compare(n1,n2)>0) n1
      else n2
    }
  }
  def main(args: Array[String]): Unit = {
    val c=new Calculator(12,21)
    println(c.max)
  }
}
