package com.xjh.scala
/**
 * list和tuple
 * @author xjh 2018.08.20
 */
object TestCollection {
	def main(args: Array[String]) {

		var t = List(1,2,3,5,5)  //list集合
//		println("---001--"+t(2))  


//		map 个位置相加  函数编程 
//注意 这里的map不是集合 而是指的一个函数
//		println(t.map(a=> {print("***"+a); a+2}));
		
		
//		println(t.map(_+1));  //这里的_ 默认指的是集合中的元素
	  
		var t2 = t.+:("test");//添加元素
//		println(t2)
//		println(6::t2);    
//		println(t2);
//		t2 = t::6::Nil;//组成新的List  t作为一个元素
//		println(t2);

//		t2.foreach(t=>print("---+++"+t))
//		t2.foreach(println(_))


//		println("/--***---"+t.distinct)    //distinct为去重
//		println("---+++++********************Slice"+t.slice(0, 2))
		

//		for(temp<-t2){
//		  print(temp)
//		}

//		println("-*--*--*--*--*--*--*--*--*-")
//		for(i <- 0 to t2.length-1){
//		  println(i)
//		  println(t2(i))
//		}


//		println("-*--*--*--*--*--*--*--*--*-")
		println("t:"+t)
//		println(t./:(100)({  //最终结果为100-16(1 2 3 5 5相加)等于84
//		    (sum,num)=>print(sum+"--"+num+" ");
//			sum-num
//		}));
//		
//			println(t./:(0)({  //最终结果为1 2 3 5 5相加为16
//		    (sum,num)=>print(sum+"--"+num+" ");
//			sum+num  //这里如果用- 加过为-16（表示0-1-2-3-5-5）
//		}));
		 
		// 1,2,3,5,5
		println(t.reduce(_-_))  //reduce语句表示 用-表示（1-2-3-5-5=-14） 用+表示（1+2+3+5+5=16）
		println(t.reduce(_+_))
		//上述语句完整表达如下
//		println(t.reduce((x,y)=>{println(x+" "+y);x-y}))
		

//		println("-*--*--*--*--*--*--*--*--*-")
		println(t.foldLeft(10)((sum,num)=>{print(sum+"--"+num+" ");
			num+sum;
		}));

//		println("-*--*--*--*--*--*--*--*--*-")
		println(t.map(v =>v+2));

//		println("-*--*--*--*--*--*--*--*--*-")
//		元组
		var tuple01 = (1,5,6,6);
		println(tuple01._1)
		println(tuple01._4)
		
	}
}