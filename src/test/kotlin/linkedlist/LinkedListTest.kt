package linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LinkedListTest {

    @Test
    fun `Should add one element in a linked list`() {
        val linkedListTest = LinkedList()
        linkedListTest.push(2)

        Assertions.assertEquals(2, linkedListTest.head?.value)
    }

    @Test
    fun `Should add two elements in a linked list`() {
        val linkedListTest = LinkedList()
        linkedListTest.push(2)
        linkedListTest.push(3)

        Assertions.assertEquals(3, linkedListTest.head?.value)
        Assertions.assertEquals(2, linkedListTest.head?.next?.value)
    }

    @Test
    fun `Should append one element in a linked list`() {
        val linkedListTest = LinkedList()
        linkedListTest.append(2)

        Assertions.assertEquals(2, linkedListTest.head?.value)
    }

    @Test
    fun `Should append two elements in a linked list`() {
        val linkedListTest = LinkedList()
        linkedListTest.append(2)
        linkedListTest.append(3)

        Assertions.assertEquals(2, linkedListTest.head?.value)
        Assertions.assertEquals(3, linkedListTest.head?.next?.value)
    }

    @Test
    fun `Should append with two elements in a linked list and validate head and tail`() {
        val linkedListTest = LinkedList()
        linkedListTest.appendWithTail(2)
        linkedListTest.appendWithTail(3)
        linkedListTest.appendWithTail(4)
        linkedListTest.appendWithTail(5)

        Assertions.assertEquals(2, linkedListTest.head?.value)
        Assertions.assertEquals(5, linkedListTest.tail?.value)
    }
}