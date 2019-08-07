package scala03

/**
  * 高阶函数：一个接受其他函数作为参数或者返回一个函数的函数
  * @author xjh 2018.10.18
  */
object FuncProgram02 {
  //函数sum是一个接受函数参数的函数，因此，是一个高阶函数
  // 这里函数的功能是 a到b的所有数字求和
  def sum(f: Int => Int, a: Int, b: Int): Int = { //这里f是一个函数
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
  }

  def self = (x: Int) => x //定义一个函数 输出参数本身
  def square = (x: Int) => x * x

  def sumSquare(a: Int, b: Int): Int = {
    if (a > b) 0 else square(a) + sumSquare(a + 1, b)
  }

  def main(args: Array[String]): Unit = {
    println("sum: "+sum(self, 1, 10))
    println("------------------------------------")
    println("sumSquare: "+sumSquare(1,10))
  }
}
