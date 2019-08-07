package scala01

import java.io.PrintWriter

/**
  * 写入文本文件
  *
  * @author xjh 2018.10.16
  */
object WriterToFile {
  def main(args: Array[String]): Unit = {
    val out=new PrintWriter("D:\\ideaCode\\scalaCode\\test.txt")
    for(i<- 1 to 5) out.print(i)  //这里将12345写入目标文件中
    out.close()   //需要注意的是，这里只有执行close语句（文件流关闭），才能看到文件生成
  }
}
