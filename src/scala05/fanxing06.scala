package scala05

/**
  * Manifest Context Bounds
  * 在Scala中，如果要实例化一个泛型数组，就必须使用Manifest Context Bounds。
  * 也就是说，如果数组元素类型为T的话，需要为类或者函数定义[T: Manifest]泛型类型，这样才能实例化Array[T]这种泛型数组。
  * @author xjh 2018.11.13
  */
object fanxing06 {
  class Meat(val name: String)
  class Vegetable(val name: String)
  def packageFood[T: Manifest](food: T*) = {
    val foodPackage = new Array[T](food.length)
    for (i <- 0 until food.length) foodPackage(i) = food(i)
    foodPackage
  }
  def main(args: Array[String]): Unit = {
    val s1 = new Meat("mice")
    val s2 = new Meat("Beef")
    val s3 = new Meat("chicken")
    val sMeat=packageFood(s1,s2,s3)
    for(i <- 0 until  sMeat.length) //until不到arr.length 这里为正确表示，to会报错
      println(sMeat(i))   //遍历
  }
}
