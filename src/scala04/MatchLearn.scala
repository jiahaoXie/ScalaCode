package scala04

/**
  * 类型匹配 match语句
    * 1.类型模式匹配
    * 2.守卫(guard) 在模式匹配中添加一些必要的处理逻辑
  * @author xjh 2018.10.17
  */
object MatchLearn {
  def main(args: Array[String]): Unit = {
    //1.类型模式匹配
    for (elem <- List(1, 12.5, "abc", "123", 100, 'a')) {
      val t = elem match {
        case i: Int => i + " is a Integer..."
        case j: String => j + " is a String..."
        case k: Double => k + " is a double..."
        case _ => "It's no work..."
      }
      println(t)
    }
    println("----------------------------------")
    //2.守卫(guard) 在模式匹配中添加一些必要的处理逻辑
    for (ii <- List(1, 2, 3, 4, 5, 6, 7, 8, 9)){
      ii match {
        case _ if (ii%2==0)=>println(ii + " is even.")
        case _ =>println(ii + " is odd.")
      }
    }
  }
}
