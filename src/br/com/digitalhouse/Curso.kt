package br.com.digitalhouse

class Curso {
    val nome:String? = null
    val codigoDeCurso:Int? = null


    override fun equals(other: Any?): Boolean {
        return other is Curso && this.codigoDeCurso==other.codigoDeCurso
    }



}