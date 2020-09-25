package br.com.digitalhouse

fun main() {
    val titutar1 = ProfTitutar("João Pedro", "Santos", 1, 0, "JavaScript")
    val titutar2 = ProfTitutar("Paloma", "Souza", 2, 0, "Modelagem de dados")

    val adjunto1=ProfAdjunto("Italo","Francisco",5,0,30)
    val adjunto2=ProfAdjunto("Marcia","Matarazzo",6,0,60)

    val aluno1=Aluno("Leonardo","Alves",100)
    val aluno2=Aluno("Luisa","Brito",200)
    val aluno3=Aluno("Mathias","Alvares",200)
    val aluno4=Aluno("Cintia","Garcia",300)
    val aluno5=Aluno("Ricardo","Marques",400)

    val curso1=Curso()
    curso1.nome="Full Stack"
    curso1.codigoDeCurso=20001
    curso1.qtdeMaximaAlunos=3
    curso1.profTitutar=titutar1
    curso1.profAdjunto=adjunto1


    val curso2=Curso()
    curso2.nome="Android"
    curso2.codigoDeCurso=20002
    curso2.qtdeMaximaAlunos=2
    curso2.profTitutar=titutar2
    curso2.profAdjunto=adjunto2


    curso1.adicionarUmAluno(aluno1)
    curso1.adicionarUmAluno(aluno2)

    curso2.adicionarUmAluno(aluno3)
    curso2.adicionarUmAluno(aluno4)
    curso2.adicionarUmAluno(aluno5)


}