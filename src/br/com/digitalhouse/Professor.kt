package br.com.digitalhouse

abstract class Professor (open val nome:String,open val sobrenome:String,
                          open val codigoDeProfessor: Int,open val tempoDeCasa:Int){



    override fun equals(other: Any?): Boolean {
        return other is Professor && this.codigoDeProfessor==other.codigoDeProfessor
    }
}