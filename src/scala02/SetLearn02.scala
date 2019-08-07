package scala02
import scala.collection.mutable.Set
/**
  *可变集合 需要引入scala.collection.mutable.Set包
  * @author xjh 2018.10.16
  */
object SetLearn02 {
  def main(args: Array[String]): Unit = {
    val set=Set("abc","ABC")
    set+="123"
    println("set : "+set)
  }
}
