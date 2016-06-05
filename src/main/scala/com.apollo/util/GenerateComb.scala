package com.apollo.util

/**
  * Created by rao on 16-3-6.
  */
object GenerateComb {
  def expandElement(x:List[List[Int]],
                    y:List[Int],
                    depth:Int):List[List[Int]] = {
    var code:List[List[Int]] = List()
    val ax = x.apply(depth)
    for (i <- ax){
      code = code :+ (y :+ i)
    }
    code
  }

  def expandGroup(x:List[List[Int]],
                  y:List[List[Int]],
                  depth:Int):List[List[Int]] = {
    var code:List[List[Int]] = List()
    for (a_list <- y){
      code = code ++: expandElement(x, a_list, depth)
    }
    code
  }

  def helper(depth:Int, bank:List[List[Int]]):List[List[Int]] = {
    if (depth==0){
      val tmp = bank.apply(depth)
      var ax:List[List[Int]] = List()
      for(x <- tmp){
        ax = ax :+ List(x)
      }
      ax
    }
    else{
      val expanded = helper(depth-1, bank)
      expandGroup(bank, expanded, depth)
    }
  }

  def generateComb(bank:List[List[Int]]) = {
    val width = bank.length
    val depth = width - 1
    val result = helper(depth, bank)
    println(result.length)
    println(result)
  }

  def main(args: Array[String]) {
    val bank = List(List(7, 2), List(3, 4))
    generateComb(bank)
  }
}
