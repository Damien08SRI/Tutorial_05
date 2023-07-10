package Demo5

import scala.io.StdIn
object Q1 extends App{

  println("Enter a string: ")

  val InputInteger = StdIn.readInt()

  private def Prime(num:Int): String ={
    num match {
    case x if x == 1 => "false"
    case x if x == 2 => "true"
    case x if (x > 10) && (x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0) => "false"
    case _: Int => "true"
    }
  }

  println(Prime(InputInteger))

}
