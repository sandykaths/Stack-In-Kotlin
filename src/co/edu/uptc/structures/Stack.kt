package co.edu.uptc.structures;

class Stack <T> (var top:Node<T>? = null){

    fun push(element:T): Boolean{
        val newNode = Node(element)
        if(top == null){
            top = newNode
        }else{
            newNode.next = top
            top = newNode
        }
        return true;
    }

    fun peek():T{

    }

    fun pull():T{

    }

    fun isEmty():Boolean{
        
    }
}