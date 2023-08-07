package linkedlist

class DoublyLinkedList {
    inner class Node(
        val value: Int? = null,
        var prev: Node? = null,
        var next: Node? = null
    )

    var head: Node? = null

    /**
     * Complexity Analysis:
     *  Time Complexity: O(1)
     *  Auxiliary Space: O(1)
     */
    fun push(value: Int) {
        val node = Node(value)
        node.next = head
        node.prev = null

        head?.let {
            it.prev = node
        }
        head = node
    }
}