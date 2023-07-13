package linkedlist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingleLinkedListTest {

    @Test
    fun `Should add one element in a linked list`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.push(2)

        Assertions.assertEquals(2, singleLinkedListTest.head?.value)
    }

    @Test
    fun `Should add two elements in a linked list`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.push(2)
        singleLinkedListTest.push(3)

        Assertions.assertEquals(3, singleLinkedListTest.head?.value)
        Assertions.assertEquals(2, singleLinkedListTest.head?.next?.value)
    }

    @Test
    fun `Should append one element in a linked list`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.append(2)

        Assertions.assertEquals(2, singleLinkedListTest.head?.value)
    }

    @Test
    fun `Should append two elements in a linked list`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.append(2)
        singleLinkedListTest.append(3)

        Assertions.assertEquals(2, singleLinkedListTest.head?.value)
        Assertions.assertEquals(3, singleLinkedListTest.head?.next?.value)
    }

    @Test
    fun `Should append with two elements in a linked list and validate head and tail`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendWithTail(2)
        singleLinkedListTest.appendWithTail(3)
        singleLinkedListTest.appendWithTail(4)
        singleLinkedListTest.appendWithTail(5)

        Assertions.assertEquals(2, singleLinkedListTest.head?.value)
        Assertions.assertEquals(5, singleLinkedListTest.tail?.value)
    }

    @Test
    fun `Should append with two elements in a linked list recursive`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertEquals(2, singleLinkedListTest.head?.value)
        Assertions.assertEquals(3, singleLinkedListTest.head?.next?.value)
    }
}