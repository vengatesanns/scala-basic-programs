package custom.collections.lib

/**
 * Vengatesan Nagarajan 14-Dec-2020
 */
trait CList[A] {

  /**
   * Head - First Element of the of the list
   * Tail - Last Element of the List
   * isEmpty - Whether to check the list is empty or not
   * add(String) - To add the elements to the list
   * toString - To print the list
   */

  def head: A

  def tail: A

  def isEmpty: Boolean

  def add(element: A): Unit

}

class Node[A](element: A) {
  var currElement: A = element
  var previousNode: Node[A] = null
  var nextNode: Node[A] = null
}


class LinkedList[A] extends CList[A] {

  private var list: Node[A] = null;

  /**
   * Add New Elements
   *
   * @param element
   */
  def add(element: A): Unit = {
    if (list == null) {
      list = new Node(element)
    }
    else {
      val tailNode: Node[A] = getTailElementNode
      tailNode.nextNode = new Node(element)
    }
  }

  // Get the Current Element Node
  private def getTailElementNode: Node[A] = {
    def getNode(currElement: Node[A]): Node[A] = {
      if (currElement.nextNode == null) currElement
      else {
        getNode(currElement.nextNode)
      }
    }

    val tailNode = getNode(list)
    tailNode
  }

  // To Print the LinkedList
  def print(): Unit = {
    def printlist(currElementNode: Node[A]): String = {
      if (currElementNode.nextNode == null) currElementNode.currElement.toString
      else {
        ""
        //        s"${currElementNode.currElement}  -> printlist(currElementNode.nextNode)
      }
    }

    val linkedListData = if (this.list != null) printlist(this.list) else null;
    println(linkedListData)
  }

  /**
   * Return the head node
   *
   * @return head node
   */
  override def head: A = if (this.list == null) throw new NoSuchElementException else this.list.currElement

  /**
   * Returns the tail node
   *
   * @return tail node
   */
  override def tail: A = if (this.list == null) throw new NoSuchElementException else getTailElementNode.currElement

  /**
   * Returns List IsEmpty or Not
   *
   * @return list empty or not
   */
  override def isEmpty: Boolean = if (this.list == null) true else false
}


// Execution of List
object Main extends App {

  // String Type
  val employeeList = new LinkedList[String];
  employeeList.add("Saravanan")
  employeeList.add("Vengat")
  employeeList.add("Mano")
  employeeList.add("Senthil")
  employeeList.add("Jei")
  employeeList.add("Maria Dass")
//  println(employeeList.print)
  println(employeeList.head)
  println(employeeList.tail)
  println(employeeList.isEmpty)

  val numbersList = new LinkedList[Int];
  numbersList.add(1)
  numbersList.add(2)
  numbersList.add(4)
  numbersList.add(6)
  numbersList.add(8)
  println(numbersList.print())
  println(numbersList.head)
  println(numbersList.tail)
  println(numbersList.isEmpty)

  val salaryDetails = new LinkedList[Double];
  println(salaryDetails.print())
  println(salaryDetails.isEmpty)
  println(salaryDetails.head)
  println(salaryDetails.tail)

}


