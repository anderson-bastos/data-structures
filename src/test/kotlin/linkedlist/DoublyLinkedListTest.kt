package linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DoublyLinkedListTest {

    @Test
    fun `Should add one element in a doubly linked list`() {
        val doublyLinkedList = DoublyLinkedList()
        doublyLinkedList.push(2)
        doublyLinkedList.push(3)

        Assertions.assertEquals(3, doublyLinkedList.head?.value)
        Assertions.assertEquals(2, doublyLinkedList.head?.next?.value)
        Assertions.assertEquals(3, doublyLinkedList.head?.next?.prev?.value)
    }
}