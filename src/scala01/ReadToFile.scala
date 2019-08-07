package scala01
import scala.io.Source
/**
  * 读取文本文件中的内容
  * 使用Scala.io.Source的getLines方法实现对文件中所有行的读取
  * @author xjh 2018.10.16
  */
object ReadToFile {
  def main(args: Array[String]): Unit = {
    val inputFile = Source.fromFile("D:\\ideaCode\\scalaCode\\test.txt")
    val lines=inputFile.getLines()  //返回的结果是一个迭代器
    for(l <- lines) println(l)
  }
}
