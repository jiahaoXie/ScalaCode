package scala02

/**
  * 集合（Set）简单运用
  * 集合包括可变集合和不可变集合，缺省情况下创建的是不可变集合
  * 这个demo创建的 不可变集合
  * @author xjh 2018.10.16
  */
object SetLearn {
  def main(args: Array[String]): Unit = {
    var mySet=Set("Hadoop","Spark")
    //因为是不可变集合 所以这里要用var定义变量 如果定义的是val会报错
    mySet+="Scala"
    println(mySet)    //这里原理实则和java的String一样 在内存中开辟一个新的内存空间存放数据
    println(mySet.contains("Spark"))
  }
}
