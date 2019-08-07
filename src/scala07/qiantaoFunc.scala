package scala07
import scala.util.control.Breaks._
/**
  * 1.嵌套函数里使用return
  * 2.使用break关键字
  * @author xjh 2018.12.19
  */
object qiantaoFunc {
  def main(args: Array[String]): Unit = {
    println(add_outer())
    println(BreakFunc())
  }
  def add_outer(): Int ={
    var res=0;
    //在函数里面在定义一个函数
    def add_inner(): Unit ={
      for (i<-0 until 10){
        if (i==5) return
        res+=i
      }
    }
    add_inner()   //调用内层函数
    res //输出res
  }
  def BreakFunc(): Int ={
    var res=0
    breakable{  // break关键字 与breakable代码块配合使用
      for (i<- 0 until 10){
        if(i==9) break
        res+=i
      }
    }
    res
  }
}
