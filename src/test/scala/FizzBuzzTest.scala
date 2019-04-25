import org.scalatest.FlatSpec

class FizzBuzzTest extends FlatSpec {
  val target = new FizzBuzz

  "fizzBuzz" should "return itself" in {

    assert(target.fizzBuzz(1) == "1")
    assert(target.fizzBuzz(2) == "2")
    assert(target.fizzBuzz(4) == "4")
    assert(target.fizzBuzz(7) == "7")

  }

  "fizzBuzz" should "return fizz" in {

    (1 to 100)
      .filterNot(_ % 15 == 0)
      .filter(_ % 3 == 0)
      .foreach(x =>
        assert(target.fizzBuzz(x) == "fizz")
      )

    //    assert(target.fizzBuzz(3) == "fizz")
    //    assert(target.fizzBuzz(6) == "fizz")
    //    assert(target.fizzBuzz(9) == "fizz")

  }

  "fizzBuzz" should "return buzz" in {

    assert(target.fizzBuzz(5) == "buzz")
    assert(target.fizzBuzz(10) == "buzz")
    assert(target.fizzBuzz(20) == "buzz")
    assert(target.fizzBuzz(100) == "buzz")

  }

  "fizzBuzz" should "return fizzbuzz" in {

    assert(target.fizzBuzz(15) == "fizzbuzz")
    assert(target.fizzBuzz(30) == "fizzbuzz")

  }

}
