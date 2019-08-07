package scala01

/**
  * 简单函数编程
  * @author xjh 2018.11.07
  */
object testFunction {
  def main(args: Array[String]): Unit = {
//    println(sayHello("xjh",23));
    println(sum(1,2,3,4,5))
  }

  //带返回值的函数
  def sayHello(name: String,age:Int): Int ={
    if(age>18){
      println(name+" ,you are adult");
      age;  //age是这里的函数返回值 因为sayHello函数的返回值上面我们定义的是Int型
    }else{
      println(name+" ,you are adult");
      age;
    }
  }
  //函数参数为变长参数(可根据main方法中的需要 选择一个或多个参数)
  def sum(num: Int*):Int={
    var sum=0;
    for(n<-num)sum+=n;
    sum;
  }
}
