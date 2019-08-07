package scala04

/**
  * Option与模式匹配
  * Scala有一种特殊的类型，叫做Option。Option有两种值，一种是Some，表示有值，一种是None，表示没有值。
  * @author xjh 2018.11.12
  */
object MatchToOption {
  val grades = Map("Leo" -> "A", "Jack" -> "B", "July" -> "C")

  def getGrade(name: String): Unit = {
    val grade = grades.get(name)
    grade match {
      case Some(grade) => println("your grade is " + grade)
      case None => println("Sorry, no you grade")
    }
  }

  def main(args: Array[String]): Unit = {
    getGrade("July")
    getGrade("xjh")
  }
}
