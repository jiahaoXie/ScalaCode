package scala07

import scala.collection.mutable.ArrayBuffer

/**
  * 扩大内部类的作用域 ：
     * 1.利用伴生类和伴生对象
     * 2. 利用类型投影
  * @author xjh 2018.12.22
  */
//1.利用伴生类和伴生对象
//object Class{ //伴生对象
//  class Student(val name: String){
//  def getStudent=name
//}
//  def getStudent(name:String)=new Student(name)
//}
//class Class{  //伴生类
//  val students=new ArrayBuffer[Class.Student]()
//  def setStudent(name: String)=new Class.Student(name)
//}

//2.利用类型投影
class Class {
  class Student(val name: String){
    def getStudent=name
  }
  val students = new ArrayBuffer[Class#Student]
  def setStudent(name: String) =  {
    new Student(name)
  }
}
object ClassLearn07 {
  def main(args: Array[String]): Unit = {
    val c1 = new Class
    val leo = c1.setStudent("leo")
    c1.students += leo

    val c2 = new Class
    val jack = c2.setStudent("jack")
    c1.students += jack

    for (i <- c1.students)  //成功将jack(c2的内部对象) 加入到c1的内部部队向中 完成对内部类的作用域扩展
      print(i.getStudent + " ")
  }
}
