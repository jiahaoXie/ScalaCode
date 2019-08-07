package scala02

/**
  * 抽象类的简单运用
  * @author xjh 2018.09.05
  */
object AbstracrClass {
  def main(args: Array[String]): Unit = {
    var d=new Dog
    d.show()
    println("----------------------------")
    var p=new Pig
    p.show()
  }
  /**
    * 定义抽象类
    */
  abstract class Animal{
    var name:String   //抽象的var,带有一个抽象的getter方法
    var age:Int;              //抽象的var,带有抽象的getter/setter方法
    def show                  //没有方法体/函数体，是一个抽象方法
  }

  /**
    * 实现类 重写抽象方法  使用override保留字
    */
  class Dog extends Animal{
    override var name="dog";
    override var age=23
    override def show(){
      println("name :"+this.name+"\tage :"+this.age)
    }
  }

  /**
    * 实现类 重写方法 不需要使用overrride关键字
    */
  class Pig extends Animal{
    var name="pig"
    var age=20
    def show(){
      println("name :"+this.name+"\tage :"+this.age)
    }
  }
}
