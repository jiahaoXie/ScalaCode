package scala07

/**
  * Java中的Map与Scala Map之间的隐式转换
  *
  * @author xjh 2018.12.22
  */
object JavaMapToScalaMap {
  def main(args: Array[String]): Unit = {
    //java中的HashMap 隐式转换为scala中的Map
    import scala.collection.JavaConversions.mapAsScalaMap
    val javaScore=new java.util.HashMap[String,Int]()  //创建java类型的HashMap
    javaScore.put("Alice",80) //在HashMap中放入元素
    javaScore.put("Bob",90)
    javaScore.put("Cindy",98)

    val scalaScores:scala.collection.mutable.Map[String,Int]=javaScore
    //java和scala之间直接完成隐式转换
    for ((k, v) <- scalaScores) {
      println(k + ":" + v+"; ")
    }

  //2.scala中的Map隐式转换为java中的HashMap
  import  scala.collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._
    val scalaAttrMap=Map(FAMILY -> "Serif", SIZE -> 12)
    val font=new java.awt.Font(scalaAttrMap)
  }
}
