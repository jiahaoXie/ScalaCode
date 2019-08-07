package scala04

/**
  * 模式匹配的运用 case类的匹配
  * case类是一种特殊的类，它们经过优化以被用于模式匹配。
  * 使用模式匹配，功能性上来说，与isInstanceOf一样，也是判断主要是该类以及该类的子类的对象即可，不是精准判断的
  * @author xjh 2018.10.17
  */
object MatchToCase {
  def main(args: Array[String]): Unit = {
    case class Car(brand: String, price: Int)
    val myBYDCar = new Car("BYD", 89000)
    val myBMWCar = new Car("BMW", 1200000)
    val myBenzCar = new Car("Benz", 1500000)
    for (car <- List(myBYDCar, myBMWCar, myBenzCar)) {
      car match{
        case Car("BYD", 89000) => println("Hello, BYD!")
        case Car("BMW", 1200000) => println("Hello, BMW!")
        case Car(brand, price) => println("Brand:"+ brand +", Price:"+price+", do you want it?")
      }
    }
  }
}
