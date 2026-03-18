package co.edu.uptc.model

class Student(val name: String, val code: Int, val semester: Int){
    override fun toString(): String {
        return "\nnombre del estudiante:$name\ncódigo:$code\nsemestre:$semester"
    }
}