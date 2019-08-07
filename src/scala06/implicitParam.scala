package scala06

/**
  * 隐式参数
  * @author xjh 2018.11.13
  */
object implicitParam {
class SignPen{
  def write(content:String)=println(content)
}
  implicit val signPen=new SignPen
  def signForExam(name:String)(implicit signPen: SignPen): Unit ={
    signPen.write(name+" come to exam in time")
  }

  def main(args: Array[String]): Unit = {
    signForExam("xjh")
  }
}
