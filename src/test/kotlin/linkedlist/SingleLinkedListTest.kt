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
        singleLinkedListTest.appendUsingTail(2)
        singleLinkedListTest.appendUsingTail(3)
        singleLinkedListTest.appendUsingTail(4)
        singleLinkedListTest.appendUsingTail(5)

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

    @Test
    fun `Should search an element in a linked list`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertTrue(singleLinkedListTest.search(2))
        Assertions.assertTrue(singleLinkedListTest.search(3))
        Assertions.assertFalse(singleLinkedListTest.search(4))
    }

    @Test
    fun `Should search an element in a linked list using recursive Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertTrue(singleLinkedListTest.searchRecursive(2))
        Assertions.assertTrue(singleLinkedListTest.searchRecursive(3))
        Assertions.assertFalse(singleLinkedListTest.searchRecursive(4))
    }

    @Test
    fun `Should count total of elements in a linked list using iterative Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertEquals(2, singleLinkedListTest.count())
    }

    @Test
    fun `Should count total of elements in a linked list using recursive Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertEquals(2, singleLinkedListTest.countRecursive())
    }

    @Test
    fun `Should count total of elements in a linked list using recursive Approach using the tail recursive function`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertEquals(2, singleLinkedListTest.countRecursiveUsingConstantSpace())
    }

    @Test
    fun `Should reverse a linked list using iterative Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)

        Assertions.assertEquals(3, singleLinkedListTest.reverse()?.value)
    }

    @Test
    fun `Should reverse a linked list using recursive Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        Assertions.assertEquals(5, singleLinkedListTest.reverseRecursive()?.value)
    }

    @Test
    fun `Should reverse a linked list using recursive Approach util`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        Assertions.assertEquals(5, singleLinkedListTest.reverseUtil()?.value)
    }

    @Test
    fun `Should reverse a linked list using recursive Approach util LL`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        Assertions.assertEquals(5, singleLinkedListTest.reverseLL()?.value)
    }

    @Test
    fun `Should delete a node in a linked list using iterative Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        singleLinkedListTest.deleteNode(5)
        singleLinkedListTest.deleteNode(2)
        Assertions.assertFalse(singleLinkedListTest.search(5))
        Assertions.assertFalse(singleLinkedListTest.search(2))
    }

    @Test
    fun `Should delete a node in a linked list using Recursive Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        singleLinkedListTest.deleteNodeRecursive(5)
        singleLinkedListTest.deleteNodeRecursive(2)

        val tailNode = singleLinkedListTest.getNode(4)

        Assertions.assertFalse(singleLinkedListTest.search(5))
        Assertions.assertFalse(singleLinkedListTest.search(2))
        Assertions.assertNull(tailNode?.next)
        Assertions.assertEquals(3, singleLinkedListTest.head?.value)
    }

    @Test
    fun `Should delete a node in a linked list using position and Iterative Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        singleLinkedListTest.deleteNodeByPosition(1)
        singleLinkedListTest.deleteNodeByPosition(2)

        val tailNode = singleLinkedListTest.getNode(4)

        Assertions.assertFalse(singleLinkedListTest.search(3))
        Assertions.assertFalse(singleLinkedListTest.search(5))
        Assertions.assertNull(tailNode?.next)
        Assertions.assertEquals(2, singleLinkedListTest.head?.value)
    }

    @Test
    fun `Should get the nth element in linked list using Iterative Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        Assertions.assertEquals(2, singleLinkedListTest.getNth(0))
        Assertions.assertEquals(3, singleLinkedListTest.getNth(1))
        Assertions.assertEquals(4, singleLinkedListTest.getNth(2))
        Assertions.assertEquals(5, singleLinkedListTest.getNth(3))
    }

    @Test
    fun `Should get the nth element in linked list using Recursive Approach`() {
        val singleLinkedListTest = SingleLinkedList()
        singleLinkedListTest.appendRecursive(2)
        singleLinkedListTest.appendRecursive(3)
        singleLinkedListTest.appendRecursive(4)
        singleLinkedListTest.appendRecursive(5)

        Assertions.assertEquals(2, singleLinkedListTest.getNthRecursive(0))
        Assertions.assertEquals(3, singleLinkedListTest.getNthRecursive(1))
        Assertions.assertEquals(4, singleLinkedListTest.getNthRecursive(2))
        Assertions.assertEquals(5, singleLinkedListTest.getNthRecursive(3))
    }
}
