package linkedlist

class SingleLinkedList {
    var head: Node? = null
    var tail: Node? = null

    // Insertion in Linked List

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
        when(head) {
            null -> head = node
            else -> {
                var last: Node? = head
                while(last?.next != null) {
                    last = last.next
                }
                last?.next = node
            }
        }
    }

    /**
     * Complexity Analysis:
     *  Time Complexity: O(N)
     *  Auxiliary Space: O(N) - Stack
     */
    fun appendRecursive(value: Int) {
        head?.let {
            appendRecursive(it, value)
        } ?: run {
            head = Node(value)
        }
    }

    private fun appendRecursive(node: Node, value: Int) {
        node.next?.let {
            appendRecursive(it, value)
        } ?: kotlin.run {
            val newNode = Node(value)
            node?.next = newNode
        }
    }

    /**
     * Complexity Analysis:
     *  Time Complexity: O(1)
     *  Auxiliary Space: O(1)
     */
    fun appendWithTail(value: Int) {
        val node = Node(value)
        when(head) {
            null -> {
                head = node
                tail = node
            }
            else -> {
                tail?.next = node
                tail = node
            }
        }
    }

    // Search an element in a Linked List (Iterative and Recursive)

}

