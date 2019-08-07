package scala02

/**
  * 伴生对象2 简单运用
  *因为类class和他的伴生对象object可以互相访问其私有成员
  * 这里我们在class中 调用伴生对象的方法
  * 从以下这个demo我们观察到：伴生对象中定义的newTest()方法实际实现了java中static的功能,实则 他成为了静态方法
  * 在scala中，没有static关键字，取而代之的就是伴生对象的方法 。因而 t1.id=1;t2.id=2
  * @author xjh 2018.10.17
  */
class ObjectLearn03 {
  private val id = ObjectLearn03.newTest() //调用了伴生对象中的方法
  private var name=""
  def this(name: String){   //辅助构造器
    this()
    this.name=name
  }
  def info(): Unit ={
    printf("The id of %s is %d\n",name,id)
  }
}

object ObjectLearn03 {
  private var lastId = 0

  private def newTest(): Int = {
    lastId+=1
    lastId
  }

  def main(args: Array[String]): Unit = {
    val t1=new ObjectLearn03("jiahao")
    val t2=new ObjectLearn03("Kobe")
    t1.info()
    t2.info()
  }
}
