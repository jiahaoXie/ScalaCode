package scala02

/**
  * Tuple简单使用
  * @author xjh 2018.11.07
  */
object ZipLearn {
  def main(args: Array[String]): Unit = {
    val names=Array("xjh","Kode","James")
    val ages=Array(23,37,34)
    val nameAge=names.zip(ages)
    for ((name,ages)<- nameAge) println(name+":"+ages)
    //Tuple类型的元素 可以调用Array的toMap方法，讲Array转换为Map
    val nameAgeMap=nameAge.toMap
    println(nameAgeMap("xjh")); //查看map中某个Key对应的value
  }
}
