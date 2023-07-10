package Demo5

object Q5 extends App{

  def sumEvenn(num:Int): Int={
    if (num <= 0)
      0
    else{
      val current = if (num % 2 ==0)
        num
      else
        num-1

      current + sumEvenn(current - 2)

    }


  }
  println(sumEvenn(7))

}
