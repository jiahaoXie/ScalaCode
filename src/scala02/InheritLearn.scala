package scala02

/**
  * 继承简单御用
  * 1.isInstanceOf和asInstanceOf的使用
    *isInstanceOf判断对象是否是指定类的对象，如果是的话，则可以使用asInstanceOf将对象转换为指定类型
  * 2.getClass和classOf的使用
  * @author xjh 2018.11.08
  */
class  Person;
class Student extends Person
object InheritLearn {
  def main(args: Array[String]): Unit = {
    val p:Person=new Student
    var s:Student=null    //编程时注意 这里写的时var变量
    println(s)  //这里输出的值是null
    println("isInstanceOf判断： "+p.isInstanceOf[Person])
    println("getClass判断: "+p.getClass==classOf[Person])
    if(p.isInstanceOf[Student]) s=p.asInstanceOf[Student]
    println(s)  //这里的输出 表明s已经成功转换为Student类型
  }

}
