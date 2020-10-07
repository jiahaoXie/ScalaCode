package com.xjh.scala
/**
使用隐式转换加强现有类型
  超人变身（装饰类型）
  类型没有方法的时候会尝试隐式转换
 */

class Man(val name:String)

class Superman(val name:String){
  def emitLaser = println("emit a pingpang ball!")
}

object Implicit02 {
  implicit def man2superman(man:Man):Superman = new Superman(man.name)

  def main(args: Array[String]) {
    val yasaka = new Man("yasaka")
    yasaka.emitLaser    //当实例化的对象里面没有此方法时，他就会隐私转换成声明的类 调用相应的方法
  }
}
