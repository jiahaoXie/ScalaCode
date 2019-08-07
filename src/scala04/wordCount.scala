package scala04

import scala.io.Source

/**
  * 函数式编程
  * @author xjh 2018.11.12
  */
object wordCount {
  def main(args: Array[String]): Unit = {
    val text01 = Source.fromFile("D:\\ideaCode\\scalaCode\\test.txt").mkString
    val text02=Source.fromFile("D:\\ideaCode\\scalaCode\\test02.txt").mkString
    val text=List(text01,text02)
    val num=text.flatMap(_.split(" ")).map((_,1)).map(_._2).reduceLeft(_+_)
      //函数式编程 高阶函数 flatMap(_.split(" "))这里首先将text中的内容按照空格切割
      // map((_,1))每个单词计数为1 ，map(_._2)是取元组中的第二属性 也就是数值 reduceLeft（_+_）数值做累加
    println(num)
  }
}
