package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  def isPositive(a: Int): Boolean = {
    if (a > 0) true else false
  }
  println(isPositive(-2))

  def greeting(name: String, age: Int): Unit = {
    println(s"My name is ${name}, I am ${age} years old!")
  }
  greeting("Michał", 20)

  def factorial(a: Int): Int = {
    if (a <= 0) 1 // Warunek zatrzymania rekurencji
    else a * factorial(a - 1)
  }

  println(factorial(-2))

  def fib(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fib(n - 1) + fib(n - 2)

  }
//  print(fib(6))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
//  println(isPrime(17))
  println(isPrime(21))
//  println(isPrime(127))
}



