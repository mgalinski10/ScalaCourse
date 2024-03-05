package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

//  def factorial(n: Int): Int = {
//    if (n <= 1) 1
//    else n * factorial(n - 1)
//  }

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)

  println(concatenateTailrec("Hello", 10, "  "))

  def factorial(n: Int): Int =
    @tailrec
    def factorialHelper(acc: Int, num: Int): Int = {
      if(num <= 0) acc
      else factorialHelper(acc * num, num - 1)
    }

    factorialHelper(1, n)

//  println(factorial(3))

  def isPrime(n: Int): Boolean =
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if(t <= 0) true
      else isPrimeTailrec(n / 2, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
}
