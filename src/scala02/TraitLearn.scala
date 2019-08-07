package scala02

/**
  * 特质（trait）简单运用
  * Scala的特质Trait相当于Java中的接口,不过特质中可以有实现的方法
  * @author xjh 2018.10.17
  */
trait CarId{
//  var id: Int   //这里id没有初始化 所以在子类继承该trait时，必须覆盖抽象field，提供具体的值
  var id=10
  def currentId(): Int     //定义了一个抽象方法
  def test(msg:String): Unit ={
    println(msg)
  }
}
class BYDCarId extends CarId{ //使用extends关键字
//  override var id = 10000 //BYD汽车编号从10000开始
def currentId(): Int = {id += 1; id} //返回汽车编号
}
class BMWCarId extends CarId{ //使用extends关键字
//  override var id = 20000 //BMW汽车编号从10000开始
def currentId(): Int = {id += 12; id} //返回汽车编号
}
object TraitLearn {
  def main(args: Array[String]): Unit = {
    val myCarId1 = new BYDCarId()
    val myCarId2 = new BMWCarId()
    printf("My first CarId is %d.\n",myCarId1.currentId)
    myCarId1.test("123")
    printf("My second CarId is %d.\n",myCarId2.currentId)
    myCarId2.test("abcd")
  }
}
