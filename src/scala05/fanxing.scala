package scala05

/**
  * 泛型
  * 定义类型参数，然后就可以保证使用到该类型参数的地方,也只能是这种类型。
  * @author xjh 2018.11.13
  */
object fanxing {

  /**
    * 泛型类
    * @param localId
    * @tparam T
    */
  class Student[T](val localId: T) {
    def getSchoolId(other: T) = println("S-" + other + "-" + localId);
  }

  def main(args: Array[String]): Unit = {
    val s = new Student[Int](123) //这里使用Int型
    s.getSchoolId(234)

    val s2=new Student[String]("hnu")
    s2.getSchoolId("xjh")
  }
}
