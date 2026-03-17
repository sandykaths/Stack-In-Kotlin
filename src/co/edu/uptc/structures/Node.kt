package co.edu.uptc.structures;

class Node <T>{
    var value:T 
    var next: Node<T>? = null

    constructor(value:T){
        this.value = value
        next = null
    }

}