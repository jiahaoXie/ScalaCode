package scala04

/**
  * 对Array和List及逆行模式匹配
  * @author xjh 2018.11.12
  */
object MatchToArrayList {
  //对Array进行模式匹配
  def greeting(arr:Array[String]): Unit ={
    arr match {
      case Array("xjh")=>println("Hi, I'm xjh")
      case Array(m1,m2,m3)=>println(m1+", "+m2+", "+m3)
      case Array("xjh",_g)=>println("xjh and his friends: "+_g)
      case _=>println("ok")
    }
  }
  //对List进行模式匹配
  def greeting(list:List[String]): Unit ={
    list match {
      case "xjh"::Nil=>println("Hi, I'm xjh")
      case m1::m2::m3::Nil=>println(m1+", "+m2+", "+m3)
      case "xjh"::tail=>println("xjh and his friends ")
      case _=>println("ok")
    }
  }
  def main(args: Array[String]): Unit = {
    greeting(Array("xjh"))
    greeting(Array("12","23","45"))
    greeting(Array("xjh","kobe"))
    greeting(Array("ac"))

    greeting(List("xjh","kobe","xasc"))
    greeting(List("xjh","123"))
    greeting(List("ac"))
  }
}
