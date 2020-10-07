package com.xjh.scala
/**
 * 测试函数
 * @author 谢家豪 2018.08.20
 */
object TestFunc {
  
  def sayName(name:String = "xjh"){
    println(name)
  }
  
  /**
   * 求和
   * 传递多个参数 形参里面带*号 表示可传递多个数值
   */
  def sum(elem:Int*)={  //=后面是函数体
    var sum=0
    for(e <- elem){
      sum+=e
    }
   println( sum)  //返回值
  }
  
  //数值相加
  def add(a:Int,b:Int)=a+b
  
  def add2=add(_:Int,2)  //声明函数add2（调用函数add，并且其中指定一个参数为2）
  
  //递归函数 n阶乘
  def  fac(n:Int):Int=if(n<=0) 1 else n*fac(n-1)
  
  //函数柯里化  （把参数一个个独立开来写）
  def mulitpy(x:Int)(y:Int)=x*y
  
  //匿名函数声明方式
  val t=()=>333  //声明一个函数对象付给了t
  //:后面是匿名函数的数据类型，c代表传递进来的参数
  def testf(c : ()=>Int)={
    println(c())
    100
  }
  
  //匿名函数
  var d1=(a:Int)=>a+100;
  //匿名函数作为参数,其实就是参数名 后面跟上参数类型 然后是表达式
  def testf2(callback:(Int,Int)=>Int )={
    println(callback(123,123))
  }
  
  /**
   * 嵌套函数（在def里面有一个def）
   */
  def add3(x:Int,y:Int,z:Int):Int={
    def add2(x:Int,y:Int):Int={  //函数声明
      x+y
    }
    add2(add2(x,y),z)  //调用函数
  }
  
  /**
   * sum2函数传入参数为匿名函数 f接收，返回值为匿名函数 等号后面的{}为方法体
   * 这里sumF里面实质上是一个递归函数
   */
  def sum2(f:Int=>Int):(Int,Int)=>Int={
    def sumF(a:Int,b:Int):Int=
      if (a>b) 0 else f(a)+sumF(a+1,b)
        sumF
  }
  
  /**
   * 程序入口主函数
   */
  def main(args: Array[String]): Unit = {
//    sayName()
//    println("********************")
//    sayName("kobe");    
//    sum(1,2,3,4,5,6)
//    println(add(3,6))
//    println(add2(10))
//    println(fac(5))
//    println(mulitpy(123)(321))
//     println(t())  //输出结果打印出333
//     println(testf(t))
//     testf2((a:Int,b:Int)=>{println(a*b);a*b;})  //打印两行数据a*b
//     testf2(add)
    println(add3(1,2,3))
    
    def sumInts=sum2((x)=>(x))
    println(sumInts(1,2))
  }
}