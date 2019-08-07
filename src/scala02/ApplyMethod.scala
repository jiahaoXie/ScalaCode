package scala02

/**
  * apply方法简单运用
  * @author xjh 2018.10.17
  */
class ApplyMethod{
  def apply(param:String): String ={
    println("apply method called,parameter is : "+param)
    "hello~"
  }
}
object ApplyMethod {
  def main(args: Array[String]): Unit = {
    val a=new ApplyMethod   //这里时创建实例化一个类ApplyMethod对象
    println(a("jiahao"))    //当在执行这条语句时，会调用类ApplyMethod中的apply方法
  }
}
