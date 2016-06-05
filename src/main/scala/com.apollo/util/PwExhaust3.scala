package com.apollo.util

/**
  * Created by rao on 16-3-6.
  */
object PwExhaust3 {
  def expand(x:Range, y:List[Int]):List[List[Int]] = {
    var code:List[List[Int]] = List()
    for (i <- x){
      code = code :+ (y :+ i)
    }
    code
  }

  def expand_group(x:Range, y:List[List[Int]]):List[List[Int]] = {
    var code:List[List[Int]] = List()
    for (a_list <- y){
      code = code ::: expand(x, a_list)
    }
    code
  }

  def loop_recursive(depth:Int, bank:Range):List[List[Int]] = {
    if (depth==1){
      val a = List(List(1), List(2), List(3))
      a
    }
    else{
      val expanded = loop_recursive(depth-1, bank)
      expand_group(bank, expanded)
    }
  }

  def loop_helper(depth:Int, bank:Range) = {
    val depth = 2
    val bank = 1 to 3
    val result = loop_recursive(depth, bank)
    println(result.length)
    println(result)
  }

  def main(args: Array[String]) {
    loop_helper(2, 1 to 3)
  }
}
