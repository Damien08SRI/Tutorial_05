package Demo5

object Q4 extends App {
  def eORo(num:Int): String = {
    if (num % 2 == 0)
      "Even"
    else
      "Odd"
  }

  println(eORo(5))
}
