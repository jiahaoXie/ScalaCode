package scala02

import scala.collection.mutable.ArrayBuffer

/**
  * 这里是对ArratLearn03案例的一个优化
    *这里的思路是将所有大于0的数和第一个小于0的数移动到数组前面，然后将后面的数（其他小于0的数）一次删除
  * 这个时间复杂度相比于之前那个 虽然都是O(n),但还是要快于03的方法
  * @author xjh 2018.11.07
  */
object ArrayLearn04 {
  def main(args: Array[String]): Unit = {
    val a = ArrayBuffer[Int]();
    a++=Array(-1,2,-3,4,5,-4,2,-7,10)
    var firstNegative=false;
    val keepIndex=for(i<-0 until a.length  if !firstNegative || a(i)>=0) yield {
      if(a(i)<0) firstNegative=true
      i //返回值为要保存元素的下标值
//      print(i+" ")
    }

    for(i<- 0 until keepIndex.length){a(i)=a(keepIndex(i))} //将要保存数据的元素移动到可变数组的最前端
    a.trimEnd(a.length-keepIndex.length)    //移除掉 其他负数
    println(a)
  }
}
