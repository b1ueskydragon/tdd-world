class FizzBuzz {

  def fizzBuzz(x: Int): String = {
    x match {
      case r if (r % 3 == 0) && (r % 5 == 0) => "fizzbuzz"
      case r if r % 3 == 0 => "fizz"
      case r if r % 5 == 0 => "buzz"
      case _ => x.toString
    }

  }

}
