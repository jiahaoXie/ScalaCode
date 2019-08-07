package scala02

import scala.collection.{immutable, mutable}


/**
  * SortedMap和LinkedHashMap
  * SortedMap可以自动对Map的key进行排序；LinkedHashMap按照插入的顺序进行输出
  *
  * @author xjh 2018.11.07
  */
object MapLearn02 {
  def main(args: Array[String]): Unit = {
    val ages =immutable.SortedMap("leo"->30,"alice"->15,"jen"->25);
    println(ages)

    val s=new mutable.LinkedHashMap[String,Int]
    s("abc")=30
    s("qwe")=19
    s("tre")=22
    println(s)
  }
}
