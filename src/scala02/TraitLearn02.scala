package scala02

/**
  * trait中定义具体字段
  * Scala中的Triat可以定义具体field，此时继承trait的类就自动获得了trait中定义的field
  * 但是这种获取field的方式与继承class是不同的：如果是继承class获取的field，实际是定义在父类中的；
  * 而继承trait获取的field，就直接被添加到了类中
  *
  * @author xjh 2018.11.08
  */
object TraitLearn02 {
  trait Personn{
    val num=2
  }
  class S(val name: String) extends Personn{
//    override val num: Int = 10
    def sayHello=println("Hi,I'm "+name+", I have "+num)
      //这里的num既可以直接调用trait中的num,也可以在class中直接override覆盖更新num的值
  }

  def main(args: Array[String]): Unit = {
      val s=new S("xjh")
    s.sayHello
  }
}
