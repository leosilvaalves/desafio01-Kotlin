package br.com.digitalhouse

class Curso {
    val nome:String? = null
    val codigoDeCurso:Int? = null
    val profTitutar:ProfTitutar?= null
    val profAdjunto: ProfAdjunto?= null
    val qtdeMaximaAlunos:Int=0
    val alunosMatriculados: MutableList <Aluno> = mutableListOf()

    override fun equals(other: Any?): Boolean {
        return other is Curso && this.codigoDeCurso==other.codigoDeCurso
    }



}