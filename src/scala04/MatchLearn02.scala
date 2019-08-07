package scala04

/**
  * 模式匹配
  * @author xjh 2018.11.12
  */
object MatchLearn02 {
  def judgeGrade(grade:String): Unit ={
    grade match {
      case "A"=>println("Perfect~")
      case "B"=>println("Good~")
      case "C"=>println("Pass~")
      case bad=>println("You get "+bad+",No pass")
        //这里的bad式一个指代 即可以在模式匹配中对变量赋值
    }
  }
  def main(args: Array[String]): Unit = {
    judgeGrade("A")
    judgeGrade("D")
  }
}
