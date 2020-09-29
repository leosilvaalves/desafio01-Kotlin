package br.com.digitalhouse

import java.util.*
class Matricula (val aluno: Aluno, val curso:Curso) {
    val dt= Date()
    val dataDeMatricula= dt.time

    override fun toString():String{
        return "$aluno.nome ${aluno.sobrenome} está matriculado no curso ${curso.nome}\n" +
                "Matrícula realizada em: $dataDeMatricula"
    }
}