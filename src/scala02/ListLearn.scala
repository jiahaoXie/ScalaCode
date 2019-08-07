package scala02
/**
  * List简单运用
  *@author xjh 2018.10.16
  */
object ListLearn {
  def main(args: Array[String]): Unit = {
    val fruit=List("aaa","bbb","ccc")
    val num=List(1,2,3,4,5)
    val dim=List(List(1,0,0),List(0,1,0),List(0,0,1)) //这里是定义二维列表
    println("fruit: "+fruit)
    println("num: "+num)
    println("dim: "+dim)

    val num02=10::num //允许元素进行左添加 也就是向头部添加新的元素
    println("num02: "+num02)
    val num03=num:::num02   //使用:::操作符对不同的列表进行连接得到新的列表
    println("num03: "+num03)

    for(i <- num03) //for循环  逐个遍历 输出值
      print(i+" ")
    println()

  }
}
