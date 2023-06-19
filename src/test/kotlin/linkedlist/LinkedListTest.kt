package linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LinkedListTest {

    @Test
    fun `Should add an elements in a linked list`() {
        val linkedList = LinkedList()
        linkedList.add(2)

        val element = linkedList.search(2)
        Assertions.assertEquals(2, element.value)
    }

    @Test
    fun `Should add two elements in a linked list and validate sequence`() {
        val linkedList = LinkedList()
        linkedList.add(2)
        linkedList.add(3)

        val element = linkedList.search(2)
        Assertions.assertEquals(3, element.next?.value)
    }
}