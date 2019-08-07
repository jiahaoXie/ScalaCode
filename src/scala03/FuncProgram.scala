package scala03

/**
  * 函数编程的简单运用
  * 只要在某个需要声明函数的地方声明一个函数类型，在调用的时候传一个对应的函数字面量，和使用普通变量一样。
  * @author xjh 2018.10.18
  */
object FuncProgram {
  var myFunc=(num:Int)=>num*2   //这里既可以用var 也可以用def
  //由scala内部的类型推断机制 使得函数声明时 不需要声明类型，但是 函数内部的num需要声明类型 这样才能推断初函数返回值类型
  var more=10
  var addMore=(x:Int)=>x+more
  def main(args: Array[String]): Unit = {
    println(myFunc(10)) //直接调用函数名

    println(addMore(3))
    more=5
    println(addMore(3))
  }
}
