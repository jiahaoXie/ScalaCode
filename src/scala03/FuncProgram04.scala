package scala03

/**
  * 闭包
  * 函数在变量不处于其有效作用域时，还能够对变量进行访问，即为闭包
  * Scala通过为每个函数创建对象来实现闭包，实际上对于getGreetingFunc函数创建的函数，
  * msg是作为函数对象的变量存在的，因此每个函数才可以拥有不同的msg
  * @author xjh 2018.11.12
  */
object FuncProgram04 {
def getGreetingFunc(msg:String)=(name:String)=>println(msg+","+name)

  def main(args: Array[String]): Unit = {
    val greetingHello=getGreetingFunc("hello")
    val greetingHi=getGreetingFunc("hi")
    greetingHello("xjh")
    greetingHi("hunan")
  }
}
