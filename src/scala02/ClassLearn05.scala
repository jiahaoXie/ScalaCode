package scala02

import scala.beans.BeanProperty

/**
  * Scala中得到Java风格的getter和setter方法
  * Scala的getter和setter方法的命名与java是不同的，是field和field_=的方式
  * 如果要让scala自动生成java风格的getter和setter方法，只要给field添加@BeanProperty注解即可
  *  @author xjh 2018.11.07
  */
object ClassLearn05 {
  class Student{
    @BeanProperty var name:String=_   //第一种用法是加在类成员属性前面
  }
  //第二种写法是卸载类名参数里面
  class Animal(@BeanProperty var name: String){

  }
  def main(args: Array[String]): Unit = {
    var s=new Student
    s.setName("xjh")
    println(s.getName)

    var a=new Animal("tiger")
    println(a.getName)
    a.setName("lion")
    println(a.getName)
  }
}
