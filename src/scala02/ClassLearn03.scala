package scala02
/**
  * 类的简单运用 辅助构造器this
  * @author xjh 2018.10.17
  */


object ClassLearn03 {
  class Text{
    private var value=0
    private var name=""
    private var mode=1
    def this(name: String){   //第一个辅助构造器
      this()  //调用主构造器
      this.name=name
    }
    def this(name:String,mode:Int){ //第二个辅助构造器
      this(name)
      this.mode=mode
    }
    def increment(step:Int): Unit ={
      value+=step
    }
    def current(): Int ={
      value
    }
    def info(): Unit ={
      printf("Name :%s and mode is %d\n",name,mode)
    }
  }
  def main(args: Array[String]): Unit = {
    val text1=new Text    //主构造器
    val text2=new Text("xjh") //第一个辅助构造器
    val text3=new Text("kobe",24)   //第二个辅助构造器
    text1.info()
    text1.increment(1)
    printf("Current Value is:%d\n",text2.current())

    text2.info()
    text2.increment(2)
    printf("Current Value is:%d\n",text2.current())

    text3.info()
    text3.increment(3)
    printf("Current Value is:%d\n",text3.current())
  }
}

