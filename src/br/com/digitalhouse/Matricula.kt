package br.com.digitalhouse

import java.util.*
data class Matricula (val aluno: Aluno, val curso:Curso) {

    val dataDeMatricula= Date()

    override fun toString():String{
        return "$aluno.nome ${aluno.sobrenome} está matriculado no curso ${curso.nome}\n" +
                "Matrícula realizada em: $dataDeMatricula"
    }
}