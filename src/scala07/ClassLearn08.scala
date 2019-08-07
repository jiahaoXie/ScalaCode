package scala07

/**
  * 内部类获取外部类的引用 利用到outer关键字
  * @author xjh 2018.12.22
  */
class Person(name:String){outer=>
  class  Studentt(val name:String){
    def getName="Hello,I'm "+name;
  }
  def getName(name:String)=new Studentt(name)
}
object ClassLearn08 {
  def main(args: Array[String]): Unit = {
    val c1=new Person("p1")
    val leo=c1.getName("leo")
    println(leo.getName)
  }
}
