package br.com.digitalhouse

fun main() {

    val dh=DigitalHouseManager()

    //Registrando professores
    dh.registrarProfessorTitular("João Pedro", "Santos", 1, "JavaScript")
    dh.registrarProfessorTitular("Paloma", "Souza", 2, "Modelagem de dados")

    dh.registrarProfessorAdjunto("Italo","Francisco",5,30)
    dh.registrarProfessorAdjunto("Marcia","Matarazzo",6,60)

    //Registrando alunos
    dh.registrarAluno("Leonardo","Alves",100)
    dh.registrarAluno("Luisa","Brito",200)
    dh.registrarAluno("Mathias","Alvares",300)
    dh.registrarAluno("Cintia","Garcia",400)
    dh.registrarAluno("Ricardo","Marques",500)

    //Registrando curso e alocando os professores nos cursos
    dh.registrarCurso("Full Stack",20001,3)
    dh.alocarProfessores(20001,1,5)

    dh.registrarCurso("Android",20002,2)
    dh.alocarProfessores(20002,2,6)

    //Matriculando os alunos nos cursos
    dh.matricularAluno(100,20001)
    dh.matricularAluno(200,20001)

    dh.matricularAluno(300,20002)
    dh.matricularAluno(400,20002)
    dh.matricularAluno(500,20002)

    //Verificando em quais cursos o aluno Leonardo está matriculado
    dh.listaAlunos[0].verificarCurso(dh.listaCursos)



}