package scala02

/**
  * 使用yield和函数式编程实现数组转换
  * 利用yield及逆行数组转换的新数组与原来的类型保持一致
  * @author xjh 2018.11.07
  */
object ArrayLearn02 {
  def main(args: Array[String]): Unit = {
    val a=Array(1,2,3,4,5,6)
    val a2=for (i<-a) yield i*i
    //这里使用yield关键字实现原数组内的元素都变成原来的平方
    print("a: ")
    for(i<-a)
      print(i+" ")
    println()

    print("a2: ")
    for(i<-a2)
      print(i+" ")
    println()

    val a3=for (i<-a if i%2==0) yield 2*i //yield关键字结合if，只转换所需要的额元素
    print("a3: ")
    for(i<-a3)
      print(i+" ")
    println()

    //这里的a3还可以采用scala中的函数时编程转换数组 即a3等价于a4
    val a4=a.filter(_%2==0).map(2*_)
    print("a4: ")
    for(i<-a4)
      print(i+" ")
    println()
  }
}
