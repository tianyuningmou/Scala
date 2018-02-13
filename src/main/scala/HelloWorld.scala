import scala.io.Source

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    println("你好，世界！")
    // 数字
    println(1 + 2)
    // 字符串
    val msg1 = "Scala is very difficult"
    println(msg1)
    val msg2:String = "Scala is very interesting"
    println(msg2)
    val msg3 = "Scala 你好"
    println(msg3)
    // 循环
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
    // 使用类型参数化数组
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "World\n"
    for (i <- 0 to 2)
      print(greetStrings(i))
    greetStrings.update(0, "你好")
    greetStrings.update(1, "，")
    greetStrings.update(2, "世界")
    for (i <- 0 to 2)
      print(greetStrings(i))
    // 读取文件
    if (args.length > 0){
      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + "" + line)
    }
    else
      Console.err.println("\nPlease enter filename")
  }
}

