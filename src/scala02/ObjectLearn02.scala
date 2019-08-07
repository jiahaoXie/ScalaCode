package scala02

/**
  * 伴生对象:当单例对象object与某个类class共享同一个名称时，他被称作是这个类的伴生对象（companion object）
  * 类class和他的伴生对象object可以互相访问其私有成员
  *
  * @author xjh 2018.10.17
  */
class ObjectLearn02 private { //private声明一个私有类
  val t2 = "class :TestObject"
  var t = 123
  def func01() = {
    println("gaga01");
  }
}

object ObjectLearn02 {
  val t1 = 123;
  var ssssgagag = 1444;
  val single = new ObjectLearn02();

  def func02() = {
    println("func02");
  }

  def main(args: Array[String]): Unit = {
    val t1 = new ObjectLearn02(); //实例化一个私有类对象

    println(t1.t2);
    t1.func01();

    ObjectLearn02.func02();
    println(ObjectLearn02.t1)
    println(ObjectLearn02.ssssgagag)
  }
}
