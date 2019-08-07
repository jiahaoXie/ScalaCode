package scala02

/**
  * update方法 使用
  * @author xjh 2018.10.19
  */
class UpdateMethod{
  def update(name:String,age:Int,address:String): Unit ={
    println("name: "+name+",age: "+age+",address: "+address)
  }
}
object UpdateMethod {
  def main(args: Array[String]): Unit = {
    val um=new UpdateMethod
    um.update("xjh",22,"changsha")
    um("xjh",22)="changsha" //这句使用update方法的特性 语句可读性变得更高
//    val currentAddr=um("xjh",22)
//    println(currentAddr)
  }
}
