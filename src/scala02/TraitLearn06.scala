package scala02

/**
  * 混合使用trait的具体方法和抽象方法
  *
  * @author xjh 2018.11.12
  */
object TraitLearn06 {

  trait Valid {
    def getName: String

    def valid: Boolean = getName == "xjh"
  }

  class Ptest(val name: String) extends Valid {
    println(valid)
    override def getName: String = name
  }

  def main(args: Array[String]): Unit = {
    val p = new Ptest("xjh")
  }
}
