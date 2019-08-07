package scala01
/**
  *for语句简单使用
  * @author xjh 2018.09.05
  */
object For {
  def main(args: Array[String]): Unit = {
    println("\"1.使用for循环打印1到10 to包含尾部\"")
    for(i <- 1 to 10){
      print(i+" ")
    }
    println()

    println("\"2. 使用for循环打印出1到9  注意:until不包含尾部\"")
    for(i <- 1 until 10){
      print(i + " ")
    }
    println()
    println("\"3.多个过滤条件间可以使用&&\"")
    for(i<-1 to 10 if i%2==0&&i!=2){
      print(i+" ")
    }
    println()
    println("4.循环嵌套")
    for(i<- 1 to 10;j<- 1 to 5){
      print(i*j+" ")
    }
    println()

    println("5.使用yield关键字返回一个新集合")
    val v1=for(i<- 1 to 5)yield i
    v1.foreach { x => print(x+" ") }
    println()
  }
}
