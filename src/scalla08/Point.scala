package com.xjh.scala
/**
 * 伴生对象
 */
class Point(val x: Int, val y: Int) {
  var t = x;
  var t1 = y;
  val isOriginal: Boolean = {
    x == 0 && y == 0
  }
  def this(xArg: Int) {
    this(xArg, 12345)
    println("hello,world~")
  }
}

object Point {
  def main(args: Array[String]): Unit = {
      val p1=new Point(123)
      println(p1.x)
      val p2=new Point(444,333)
      println(p2.x)
  }
}