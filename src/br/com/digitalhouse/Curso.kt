package br.com.digitalhouse

class Curso {
    var nome:String? = null
    var codigoDeCurso:Int? = null
    var profTitutar:ProfTitutar?= null
    var profAdjunto: ProfAdjunto?= null
    var qtdeMaximaAlunos:Int=0
    var alunosMatriculados: MutableList <Aluno> = mutableListOf()

    override fun equals(other: Any?): Boolean {
        return other is Curso && this.codigoDeCurso==other.codigoDeCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(alunosMatriculados.contains(umAluno) || (alunosMatriculados.size+1 > qtdeMaximaAlunos)){
            return false
        }else{
            alunosMatriculados.add(umAluno)
            return true
        }
    }


    fun excluirAluno(umAluno: Aluno) {
        if(alunosMatriculados.contains(umAluno)){
            alunosMatriculados.remove(umAluno)
            println("Aluno ${umAluno.nome} foi excluído do curso de ${this.nome}")
        }else{
            println("Aluno ${umAluno.nome} não está matriculado no curso de ${this.nome}")
        }
    }



}