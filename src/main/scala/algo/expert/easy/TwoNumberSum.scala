package com.europe.diaries
package algo.expert.easy

object TwoNumberSum extends App {

  val input = Array(3,5,-4,8,11,1,-1,6)
  val target = 10

  def findTwoNumbersWithSumUsingSet(input: Array[Int], target: Int): (Int, Int) = {
    var result  = (-1,-1)
    var set = Set.empty[Int]
    input.foreach(element => if(set.contains(target-element)) result = (element, target-element) else {
      set = set + element
      set
    })
    println(set)
    result
  }

  println(findTwoNumbersWithSumUsingSet(input, target))

}
