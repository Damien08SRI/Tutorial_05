package Demo5

import scala.io.StdIn
object Q6 extends App{
  def fibo(x: Int): Int = x match {
    case x if x == 0 => 0;
    case x if x == 1 => 1;
    case _ => fibo(x - 1) + fibo(x - 2);
  }

  def fiboSeq(x: Int): Unit = {
    if (x > 0)
      fiboSeq(x - 1);
    println(fibo(x));
  }

  print("Input a value to get fibonacci sequence :");
  var value = StdIn.readInt();
  fiboSeq(value);
}
