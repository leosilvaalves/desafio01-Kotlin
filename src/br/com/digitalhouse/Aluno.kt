package br.com.digitalhouse

class Aluno (val nome:String, val sobrenome:String, val codigoDeAluno:Int){

    override fun equals(other: Any?): Boolean {
        return other is Aluno && other.codigoDeAluno==this.codigoDeAluno
    }


}