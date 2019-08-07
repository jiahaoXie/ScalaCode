package scala05

/**
  * 泛型函数
  * 与泛型类类似，可以给某个函数在声明时指定泛型类型，然后在函数体内，多个变量或者返回值之间，
  * 就可以使用泛型类型进行声明，从而对某个特殊的变量，或者多个变量，进行强制性的类型限制。
  *
  * @author xjh 2018.11.13
  */
object fanxing02 {
  def getCard[T](content: T): Unit = {
    if (content.isInstanceOf[Int]) println("Int : " + content)
    else if (content.isInstanceOf[String]) println("String ：" + content)
    else println("card : " + content)
  }

  def main(args: Array[String]): Unit = {
    getCard[Int](234)
    getCard(123)  //等价于 getcard[int]（123）
    getCard("hunan")
    getCard(0.23)
  }
}
