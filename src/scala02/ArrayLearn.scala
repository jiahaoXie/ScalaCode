package scala02
import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting
/**
  * Array简单运用
  * 定长数组和可变数组
  * scala中数组分为定长数组和可变数组，默认是为定长数组（Imutable）
  * 若要定义可变数组，需要显示导入包
  * 我们可以加德纳理解，Scala中的Array等价于Java中的Array;Scala中的ArrayBuffer等价于Java中的ArrayList
  * @author xjh 2018.10.16
  */
object ArrayLearn {
  def main(args: Array[String]): Unit = {
    val arr = Array("scala", "spark","storm","flink") //定长数组
    val arrayBuf = ArrayBuffer[Int]() //这里定义的是可变数组

    arr(0)="hadoop";
    arr.toBuffer  //将定长数组转换为可变数组
    for(i <- 0 until  arr.length) //until不到arr.length 这里为正确表示，to会报错
      println(arr(i))   //遍历
    println("----------------------------")
    for (elem <- arr) {//遍历
      println(elem)
    }
    println("----------------------------")
    arrayBuf += 1 //可变数组可以用+=在尾端添加元素
    arrayBuf += (2, 3, 4, 5) //可变数组可以用+=在尾端添加多个元素
    arrayBuf ++= Array(9,6, 7,10,8) //可变数组可以用++=在尾端添加任何集合
    println("arrayBuf:" + arrayBuf)
    val aa=arrayBuf.toArray //将可变数组转换为不可变数组 得到不可变数组aa
    for(i<-aa)
      print(i+" ")
    println()
    Sorting.quickSort(aa) //这里调用封装的快排算法 有效排序
    for(i<-aa)
      print(i+" ")
    println()
    println("sum: "+arrayBuf.sum) //直接调用可变数组中内置的sum求和得到结果

    arrayBuf.trimEnd(2) //移除最后的2个元素
    println("arrayBuf:" + arrayBuf)
    arrayBuf.remove(2) //移除下标为2的元素
    println("arrayBuf:" + arrayBuf)
    arrayBuf.remove(2, 4) //移除熊下标2元素开始的4个元素

    println("arrayBuf:" + arrayBuf)

//    arrayBuf+=100
//    println("arrayBuf:" + arrayBuf)

    val a=Array(1,4,2,7,5,3,10,6)
    for(i<-a)
      print(i+" ")
    println()
    Sorting.quickSort(a)
    for(i<-a)
      print(i+" ")
    println()

    /**
      * Array与ArrayBuffer可以互相进行转换
      arrayBuf.toArray
      array.toBuffer
      */
  }
}
