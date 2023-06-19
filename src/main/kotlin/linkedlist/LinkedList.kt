package linkedlist

class LinkedList(
    private var root: Node = Node()
) {
    fun add(value: Int) {
        root.value?.let {
            addElements(root, value)
        } ?: run {
            root = Node(value)
        }
    }

    private fun addElements(node: Node, value: Int) {
        node.next?.let {
            addElements(it, value)
        } ?: run {
            node.next = Node(value)
        }
    }

    fun search(value: Int) = searchNode(root, value)

    private fun searchNode(node: Node, value: Int): Node = run {
        if(node.value == value) node
        searchNode(checkNotNull(node.next) { "Node not found!" }, value)
    }
}

