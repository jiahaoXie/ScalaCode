package scala02

/**
  * 映射map包括可变和不可变两种，默认情况下创建的是不可变映射。
  *  如果需要创建可变映射，需要引入scala.collection.mutable.Map包
  * @author xjh 2018.10.16
  */
object MapLearn {
  def main(args: Array[String]): Unit = {
    println("---------------不可变map------------------")
    val bigData = Map("scala" -> 35, "Hadoop" -> 30, "spark" -> 40)
    println(bigData)
    println(bigData("scala")) //map中通过key获得value
    println(bigData.contains("Hadoop")) //是否包含给定的值
    println(bigData.getOrElse("spark001", 70)) //通过key获得值，如果不包含给定key，则返回给定的值
    println(bigData.mkString("{", ",", "}"))
    println(bigData.drop(2))

    println("---------构造可变集合----------")
    val bigDataVar = scala.collection.mutable.Map("scala" -> 35, "Hadoop" -> 30, "spark" -> 50)
    println(bigDataVar)
    bigDataVar("spark") = 100 //更新键值对，如果不存在则添加
    bigDataVar += ("Kafka" -> 90) //使用+=添加
    for ((k, v) <- bigDataVar) {
      print(k + ":" + v+"; ")
    }
    println()
    for (a <- bigDataVar.keySet) {
      println(a) //只输出key
    }
  }
}
