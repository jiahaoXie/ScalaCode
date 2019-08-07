package scala02

import scala.collection.mutable.ArrayBuffer

/**
  * 移除数组第一个之外负数之外的所有负数
 * 这里是查询到一个删掉一个 时间复杂度 会有点高
  * @author xjh 2018.11.07
  */
object ArrayLearn03 {
  def main(args: Array[String]): Unit = {
    val a = ArrayBuffer[Int]();
    a++=Array(1,2,3,4,5,-1,-2,-3,-9)
    var firstNegative=false;
    var index=0;
    while (index<a.length){
      if(a(index)>=0){
        index+=1;
      }else{
        if(!firstNegative){
          //首次遍历到一个数为负数
          firstNegative=true
          index+=1
        }
        else{
          a.remove(index) //这里采取查询到一个 就删掉一个
//          a.length -=1
        }
      }
    }
    println(a)  //注意可变数组是可以直接这样输出的，但是不可变数组不行
//    for(i<-a)
//      print(i+" ")
//    println()
  }
}
