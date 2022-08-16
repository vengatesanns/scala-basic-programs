package scollections

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.collection.{immutable, mutable}

object MutableAndImmutableCollections extends App {
  //  Immutable Collections
  var immutableUsersArray: Vector[String] = Vector("Vengat", "Senthil", "Mano")

  println(s"Immutable Array ->  ${immutableUsersArray}")

  var immutableList: List[String] = List("Vengat", "Senthil", "Mano")
  println(s"Immutable Linked List ->  ${immutableList}")
  println(s"Immutable Linked List Head ->  ${immutableList.head}")
  println(s"Immutable Linked List Tail ->  ${immutableList.tail}")

  var immutableSet: Set[String] = immutable.HashSet("Vengat", "Senthil", "Mano", "Senthil", "Mano", "vengat")
  println(s"Immutable Set ->  ${immutableSet}")

  var immutableMap: Map[Int, String] = immutable.HashMap(1 -> "Vengat", 2 -> "Senthil", 3 -> "Mano")
  println(s"Immutable Map ->  ${immutableMap}")


  //  Mutable Collections
  var mutableUsersArray: ArrayBuffer[Integer] = ArrayBuffer()
  mutableUsersArray.addOne(1)
  mutableUsersArray.addOne(2)
  mutableUsersArray.addOne(3)
  mutableUsersArray += 1
  mutableUsersArray -= 3

  println(s"Mutable Array ->  ${mutableUsersArray}")

  var mutableListBuffer: ListBuffer[Integer] = ListBuffer()
  mutableListBuffer.addOne(10)
  mutableListBuffer.addOne(20)
  mutableListBuffer.addOne(30)
  mutableListBuffer += 40
  mutableListBuffer -= 10

  println(s"Mutable Linked List ->  ${mutableListBuffer}")
  println(s"Mutable Linked List Head ->  ${mutableListBuffer.head}")
  println(s"Mutable Linked List tail ->  ${mutableListBuffer.tail}")

  var mutableSet: mutable.HashSet[Integer] = scala.collection.mutable.HashSet()
  mutableSet += 100
  mutableSet += 200
  mutableSet += 300
  mutableSet += 300
  mutableSet += 200

  println(s"Immutable Set ->  ${mutableSet}")


  var mutableMap: mutable.HashMap[Int, String] = mutable.HashMap()
  mutableMap.addOne(100 -> "Vengat")
  mutableMap.addOne(200 -> "Senthil")
  mutableMap.addOne(300 -> "Mano")
  mutableMap += 400 -> "Jei"
  mutableMap -= 200
  mutableMap += 100 -> null

  println(s"Immutable Map ->  ${mutableMap}")

  // Lazy List
  var lazyList: LazyList[Integer] = LazyList(1, 2, 3)
  lazyList.take(1)
  lazyList.take(2)
  lazyList.map(ele => ele * 2)
  lazyList.map(ele => ele * 2).foreach(println)
}
