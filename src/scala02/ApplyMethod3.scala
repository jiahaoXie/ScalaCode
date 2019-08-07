package scala02

/**
  * 在伴生对象和apply方法结合运用时，我么可以在伴生类的apply方法中写入一些处理逻辑，这样就可以把传入的参数赋值给实例化对象的变量
  * 在Scala中，伴生对象有一个重要用途，那就是，我们通常将伴生对象作为工厂使用，这样就不需要使用关键字new来创建一个实例化对象了
  * @author xjh 2018.10.17
  */
class Car(name:String){
  def info(): Unit ={
    println("Car name is "+name)
  }
}
object Car{
  def apply(name: String): Car = new Car(name)  //apply方法会调用伴生类Car的构造方法，创建一个Car类的实例化对象
}
object ApplyMethod3 {
  def main(args: Array[String]): Unit = {
    val car=Car("BMW")  //这里会调用伴生对象中的apply方法，apply方法会创建一个Car类的实例化对象
    car.info()
  }
}
