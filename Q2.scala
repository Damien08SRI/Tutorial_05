package Demo5

import scala.io.StdIn


object Q2 extends App {

  def prime(num:Int): Boolean = num match{
    case x if x == 1 => false
    case x if x == 2 => true
    case x if (x > 10) && (x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0) => false
    case _: Int => true
  }

  def primeSeq(n:Int):Unit ={
    if (n>1) {
      primeSeq(n - 1)
      if (prime(n)) println(n)
      
    }

  }
  println("Input an Integer")
  private var value = StdIn.readInt()
  primeSeq(value)
  
}
