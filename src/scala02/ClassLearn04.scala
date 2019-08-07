package scala02

/**
  * 主构造器
  *
  * @author xjh 2018.10.17
  */
object ClassLearn04 {

  class View(val name: String, val ag: Int) {
    private var value = 0

    def increment(step: Int): Unit = {
      value += step
    }

    def current(): Int = {
      value
    }

    def info(): Unit = {
      printf("Name:%s and Age:%d\n", name, ag)
    }
  }

  def main(args: Array[String]): Unit = {
    val view=new View("xjh",23)
    view.info()
    view.increment(5)
    printf("Current Value is :%d\n",view.current())
  }
}
