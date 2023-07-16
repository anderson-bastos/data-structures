package linkedlist

import java.util.Stack

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
     *  Auxiliary Space: O(N), Stack space used by recursive calls
     */
    fun appendRecursive(value: Int, node: Node? = head) {
        head?.let {
            appendRecursive(it, value)
        } ?: run {
            head = Node(value)
        }
    }

    private fun appendRecursive(node: Node, value: Int) {
        node.next?.let {
            appendRecursive(it, value)
        } ?: run {
            val newNode = Node(value)
            node?.next = newNode
        }
    }

    /**
     * Complexity Analysis:
     *  Time Complexity: O(1)
     *  Auxiliary Space: O(1)
     */
    fun appendUsingTail(value: Int) {
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

    /**
     * Iterative Approach
     * Time Complexity: O(N), to traverse linked list.
     * Auxiliary Space: O(1), Stack space used by recursive calls
     */
    fun search(value: Int): Boolean {
        var current = head
        while(current != null) {
            when(current.value) {
                value -> return true
                else -> current = current.next
            }
        }
        return false
    }

    /**
     * Recursive Approach
     * Time Complexity: O(N), to traverse linked list.
     * Auxiliary Space: O(N), Stack
     */
    fun searchRecursive(value: Int, node: Node? = head): Boolean {
        if(node == null)
            return false

        if(node?.value == value)
            return true
        return searchRecursive(value, node?.next)
    }

    // Find Length of a Linked List (Iterative and Recursive)

    /**
     * Returns count of nodes in linked list (Iterative Approach)
     * Time complexity: O(N), Where N is the size of the linked list
     * Auxiliary Space: O(1), As constant extra space is used.
     */
    fun count(): Int {
        var count = 0
        var current = head
        while(current != null) {
            ++count
            current = current.next
        }
        return count
    }

    /**
     * Returns count of nodes in linked list (Iterative Approach)
     * Time Complexity: O(N), As we are traversing the linked list only once.
     * Auxiliary Space: O(N), Extra space is used in the recursion call stack.
     */
    fun countRecursive(node: Node? = head): Int =
        when(node) {
            null -> 0
            else -> 1 + countRecursive(node.next)
        }

    /**
     * Returns count of nodes in linked list (Recursive Approach)
     * The above recursive approach can be modified to make it a tail recursive function and thus our auxiliary space will become O(1)
     * Time Complexity: O(N), As we are traversing the linked list only once.
     * Auxiliary Space: O(1), As we are using the tail recursive function, no extra space is used in the function call stack.
     */
    fun countRecursiveUsingConstantSpace(node: Node? = head, count: Int = 0): Int =
        when(node) {
            null -> count
            else -> countRecursiveUsingConstantSpace(node.next, 1 + count)
        }

    // Reverse a Linked List

    /**
     * Time Complexity: O(N), Traversing over the linked list of size N.
     * Auxiliary Space: O(1)
     */
    fun reverse(node: Node? = head): Node? {
        var prev: Node? = null
        var current = node
        var next: Node?
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
        return head
    }


    /**
     * Time Complexity: O(N), Visiting over every node one time
     * Auxiliary Space: O(N), Function call stack space
     */
    fun reverseRecursive(node: Node? = head): Node? =
        node?.let {
            if(it.next == null) it

            val rest = reverse(it.next)
            it.next?.next = node
            it.next = null
            rest
        } ?: node

    /**
     * Reverse a linked list by Tail Recursive Method:
     * Time Complexity: O(N), Visiting every node of the linked list of size N.
     * Auxiliary Space: O(N), Function call stack space
     */
    fun reverseUtil(current: Node? = head, previous: Node? = null): Node? {
        if(head == null) return null

        if(current?.next == null) {
            head = current
            current?.next = previous
            return head
        }

        var next = current.next
        current.next = previous
        reverseUtil(next, current)
        return head
    }

    /**
     * Reverse a linked list using Stack:
     * Time Complexity: O(N), Visiting every node of the linked list of size N.
     * Auxiliary Space: O(N), Space is used to store the nodes in the stack.
     */
    fun reverseLL(): Node? {
        val stack = Stack<Node>()
        var temp = head
        while (temp?.next != null) {
            stack.add(temp)
            temp = temp.next
        }

        head = temp
        while (stack.isNotEmpty()) {
            temp?.next = stack.peek()
            stack.pop()
            temp = temp?.next
        }
        temp?.next = null
        return head
    }

    // Deletion in Linked List
}

