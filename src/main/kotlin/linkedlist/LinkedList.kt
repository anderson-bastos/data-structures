package linkedlist

class LinkedList {
    var head: Node? = null
    var tail: Node? = null

    /**
     * Complexity Analysis:
     *  Time Complexity: O(1)
     *  Auxiliary Space: O(1)
     */
    fun push(value: Int) {
        val node = Node(value)
        node.next = head
        head = node
    }

    /**
     * Complexity Analysis:
     *  Time Complexity: O(N)
     *  Auxiliary Space: O(1)
     */
    fun append(value: Int) {
        val node = Node(value)

        if(head == null) {
            head = node
            return
        }

        var last = head
        while(last?.next != null) {
            last = last.next
        }
        last?.next = node
        return
    }

    /**
     * Complexity Analysis:
     *  Time Complexity: O(1)
     *  Auxiliary Space: O(1)
     */
    fun appendWithTail(value: Int) {
        val node = Node(value)

        if(head == null) {
            head = node
            tail = node
            return
        }

        tail?.next = node
        tail = node
        return
    }
}

