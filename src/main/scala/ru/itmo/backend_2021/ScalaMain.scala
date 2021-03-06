package ru.itmo.backend_2021
import scala.NotImplementedError

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var prev = 0
    var next = 1
    for(_ <- 0 until n) {
      val temp = next
      next = prev + next
      prev = temp

    }
    prev
  }
}
