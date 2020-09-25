package br.com.digitalhouse

abstract class Professor {
    val nome:String?= null
    val sobrenome:String?= null
    val tempoDeCasa:Int?= null
    val codigoDeProfessor: Int?= null


    override fun equals(other: Any?): Boolean {
        return other is Professor && this.codigoDeProfessor==other.codigoDeProfessor
    }
}