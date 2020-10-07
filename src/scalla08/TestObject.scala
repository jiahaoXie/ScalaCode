package com.xjh.scala
/**
 * 伴生对象 ：
 			* 把static成员和非static成员用不同的表达方式，class和object，但双方具有相同的package和name，但是最终编译器会把他们编译到一起
 */
class TestObject private{    //private声明一个私有类
	val t2 = "lskjdfkljd"
			var t=123
			def func01() = {
		println("gaga01");
	}
}

object TestObject {
	val t1 = 123;
	var  ssssgagag=1444;
	val single = new TestObject();
	
	def func02() = {
		println("gaga02");
	}
	
	def main(args: Array[String]) {
		val t1 = new TestObject();  //实例化一个私有类对象
		
		println(t1.t2);
		t1.func01();
		
		
		TestObject.func02();
		println(TestObject.t1)
		println(TestObject.ssssgagag)
	}
}