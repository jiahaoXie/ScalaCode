package scala07

/**
  * 重写field的提前定义
  * @author xjh 2018.12.22
  * 默认情况下，如果父类中的构造函数代码，用到了会被子类重写的field; 那么会出现令人意想不到的一幕:
1、子类的构造函数（无参）调用父类的构造函数（无参）
2、父类的构造函数初始化field（结果正确）
3、父类的构造函数使用field执行其他构造代码，但是此时其他构造代码如果使用了该field，而且field要被子类重写，那么它的getter方法被重写，返回0（比如Int）
4、子类的构造函数再执行，重写field（结果也正确）
5、但是此时子类从父类继承的其他构造代码，已经出现了错误了
  */
class Student{
  val classNum=10
  val classScore=new Array[Int](classNum)
}
class PESStudent extends{   //如果这里是在extends后面协商父类的名称 则classScore的值为0
  override val classNum=3
}with Student //通过这种方法 子类的classScore大小为3

object OverrideMethod {
  def main(args: Array[String]): Unit = {
    val p=new PESStudent
    println(p.classNum)
    for (i<-p.classScore)
      print(i+" ")  //因为没有给其赋值 所以这里初始输出的是3个0
  }
}
