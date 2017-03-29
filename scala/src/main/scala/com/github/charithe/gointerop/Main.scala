package com.github.charithe.gointerop

import scala.scalanative.native._

object Main {
  def main(args: Array[String]): Unit = {
    println(hello.SayHello(c"world"))
  }
}

@link("hello")
@extern
object hello {
  def SayHello(name: CString): CString = extern
}
