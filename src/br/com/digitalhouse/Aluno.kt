package br.com.digitalhouse

class Aluno (val nome:String, val sobrenome:String, val codigoDeAluno:Int){

    override fun equals(other: Any?): Boolean {
        return other is Aluno && other.codigoDeAluno==this.codigoDeAluno
    }

    fun verificarCurso(listaCursos: MutableList<Curso>){
        for(curso in listaCursos){
            for(aluno in curso.alunosMatriculados){
                if(this.codigoDeAluno == aluno.codigoDeAluno){
                    println("Aluno $nome está matriculado no curso de ${curso.nome}")
                }
            }
        }
    }


}