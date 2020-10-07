package com.xjh.scala
/**
 * map集合
 */
object TestMap {
	def main(args: Array[String]) {
	  
//	  _ 通配符  =>匿名函数   <- for便利符号
	  
	  // mutable
	  // immutable
		var m1 =  Map[String,Int](("a" , 1), ("b" , 2));
		
		println("a的value:"+m1("a"));
		m1 += ("c" -> 3);
		println("m1:"+m1)
		println("************ ")
		m1.foreach(a=>{
	    	println(a+" "+a._1+" "+a._2)
		});
		
 		m1.keys.foreach(b=>println(m1(b) ));    //通过key得到对应的value值
		println(m1);
}
}