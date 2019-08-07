package scala07

/**
  * 正则表达式的简单用法
  * @author xjh 2018.12.23
  */
object RegularExpression {
  def main(args: Array[String]): Unit = {
    val pattern1="[a-z]+".r //定义一个正则表达式，使用String类的r方法
    val str1="hello 123 world 456 hello changsha"
    //获取一个字符串中，匹配正则表达式的部分，使用findAllIn，会获取到一个Iterator，迭代器
    //然后就可以去遍历各个匹配正则的部分，去进行处理
    for (matchString<-pattern1.findAllIn(str1))
      println(matchString)
    println("-------------------------")
    //使用replaceAllIn，可以将匹配正则的部分，替换掉
    println(pattern1.replaceAllIn("hello wol","hi"))

  }
}
