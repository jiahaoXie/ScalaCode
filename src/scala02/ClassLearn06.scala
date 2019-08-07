package scala02

import scala.collection.mutable.ArrayBuffer

/**
  * Scala中的内部类
  *Scala与java不同的是，每个外部类的对象的内部类，都是不同的类
  * @author xjh 2018.11.07
  */
object ClassLearn06 {
  class Class{
    class Student( name:String){  //这里的Student类相当于Class的内部类
      def getStudent=name
    }
    val students=new ArrayBuffer[Student]()
    def getStudent(name:String)={
      new Student(name)
    }
  }
  def main(args: Array[String]): Unit = {
    val c1=new Class    //这里c1只能声明为常量，不能声明为变量var
    var s11=c1.getStudent("kobe")
    var s12=c1.getStudent("curry")
    c1.students+=s11
    c1.students+=s12
//    println(c1.students)
    for(i<-c1.students)
      print(i.getStudent+" ")

    val c2=new Class
    val s21=c2.getStudent("xjh")
    val s22=c2.getStudent("wjh")
    c2.students+=s21
    c2.students+=s22
//    c1.students+=s21    //这里 因为s21是对象s2的内部类 c1无法访问
    println()
    for (i<-c2.students)
      print(i.getStudent+"~")
  }
}
