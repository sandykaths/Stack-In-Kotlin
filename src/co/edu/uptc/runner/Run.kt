package co.edu.uptc.runner

import co.edu.uptc.structures.Stack
import co.edu.uptc.model.Student

fun main(){

    val stackNumbers = Stack<Int>()
    println(stackNumbers.isEmpty())
    for (i in 0..10) {
        stackNumbers.push(i)
    }
    println(stackNumbers.isEmpty())
    println(stackNumbers.peek())
    for (i in 0..11) {
        println(stackNumbers.pop())
    }    
    println(stackNumbers.isEmpty())

    val stackStudents = Stack<Student>()
    stackStudents.push(Student("Luna", 1, 4))
    stackStudents.push(Student("Yisel", 2, 3))
    stackStudents.push(Student("Erick", 3, 7))
    stackStudents.push(Student("Jhonatan", 4, 5))
    println("Estudiantes" + stackStudents)
    println("El primer estudiante en la pila es: " + stackStudents.peek()?.name)
    stackStudents.pop()
    println("Ahora el primer estudiante en la pila es: "+stackStudents.peek()?.name)

}