package co.edu.uptc.structures;

class Stack <T> (private var top:Node<T>? = null){

    fun push(element:T): Boolean{
        val newNode = Node(element)
        if(top == null){
            top = newNode
        }else{
            newNode.next = top
            top = newNode
        }
        return true
    }

    fun peek():T?{
        if(isEmpty()) return null
        return top!!.value
    }

    fun pop():T?{
        val currentTop = top
        if(currentTop == null) return null
        val aux:T = currentTop.value
        top = currentTop.next
        return aux
    }

    fun isEmpty(): Boolean = top == null

    override fun toString(): String {
        var string:String = ""
        var current = top
        while (current != null) {
        string += current.value.toString() + (if (current.next != null) "\n" else "")
        current = current.next
        }
        return string;
    }
}