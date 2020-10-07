package com.xjh.scala

import scala.actors.Actor
/*
Actor之间相互收发消息
 */
case class Message(content:String, sender:Actor)

class YasakaActor extends  Actor{
  def act{
    while (true){
      receive{
        case Message(content,sender) => {println("yasaka received: " + content);  
                                              sender ! "abcd"}    //如果这里传递过去的是Int类型的数，根据类GagaActor中的receive函数 得到flag为false
      }
    }
  }
}

class GagaActor(val yasakaActor: YasakaActor)extends Actor{
  def act{
    yasakaActor ! Message("Hello, yasaka, I'm gaga. Are you free now?", this)

    var flag = true
    while (flag){
      receive{
        case response:String => println("gaga received: "+ response)
        case response:Int => flag=false    
      }
    }
  }
}

object Message {
  def main(args: Array[String]) {
    val yasakaActor = new YasakaActor
    val gagaActor = new GagaActor(yasakaActor)
    yasakaActor.start()
    gagaActor.start()
  }
}
