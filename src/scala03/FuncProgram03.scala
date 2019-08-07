package scala03

/**
  * 高阶函数编程
      *1.将函数作为返回值
      *2.高阶函数可以自动推断出参数类型，而不需要写明类型；而且对于只有一个参数的函数，还可以省去其小括号；
      * 如果仅有的一个参数在右侧的函数体内只使用一次，则还可以将接收参数省略，并且将参数用_来替代
  * @author xjh 2018.11.12
  */
object FuncProgram03 {
  def getGreetingFunc(msg:String)=(name:String)=>println(msg+", "+name)
  def greeting(func:String=>Unit,name: String)=func(name)   //高阶函数可以自动推断参数类型
  def tripe(func:(Int)=>Int)=println(func(3))
  def main(args: Array[String]): Unit = {
    val greetingFunc=getGreetingFunc("hello") //"hello" 实质上是函数的形参 msg
    greetingFunc("xjh")   //"xjh" 对应 name
    greeting((name:String)=>println("Hello, "+name),"xjh111")    //调用greeting函数 实参要与之前的函数名匹配
    tripe(5*_)  //这里_占位符 scala会默认为3
    tripe(5+_)
  }
}
