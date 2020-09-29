package br.com.digitalhouse

class DigitalHouseManager {
    val listaAlunos: MutableList <Aluno> = mutableListOf()
    val listaProfessores: MutableList <Professor> = mutableListOf()
    val listaCursos: MutableList <Curso> = mutableListOf()
    val listaMatriculas: MutableList <Matricula> = mutableListOf()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int ){
        val curso=Curso()
        curso.nome=nome
        curso.codigoDeCurso=codigoCurso
        curso.qtdeMaximaAlunos=quantidadeMaximaDeAlunos

        listaCursos.add(curso)

    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos){
            if(curso.codigoDeCurso==codigoCurso){
                listaCursos.remove(curso)
                break
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String , codigoProfessor: Int,
                                  quantidadeDeHoras: Int){

        val profAdj=ProfAdjunto(nome,sobrenome,codigoProfessor,0,quantidadeDeHoras)
        listaProfessores.add(profAdj)
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String,
                                  codigoProfessor: Int, especialidade: String){
        val  profTit=ProfTitutar(nome,sobrenome,codigoProfessor,0,especialidade)
        listaProfessores.add(profTit)
    }


    fun excluirProfessor(codigoProfessor: Int){
        for(professor in listaProfessores){
            if(professor.codigoDeProfessor==codigoProfessor){
                listaProfessores.remove(professor)
                break
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val aluno=Aluno(nome,sobrenome,codigoAluno)
        listaAlunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var cursoEscolhido:Curso?=null
        var alunoMatricular:Aluno?= null

        for(curso in listaCursos){
            if(curso.codigoDeCurso == codigoCurso){
                cursoEscolhido=curso
                break
            }
        }

        for(aluno in listaAlunos){
            if(aluno.codigoDeAluno == codigoAluno){
                alunoMatricular=aluno
                break
            }
        }

        if(alunoMatricular ==null){
            println("Aluno não encontrado com o código $codigoAluno.")

        }
        else if(cursoEscolhido == null){
            println("Curso não encontrado com o código $codigoCurso.")
        }else{
            val resp= cursoEscolhido.adicionarUmAluno(alunoMatricular)

            if(resp){
                val novaMatricula= Matricula(alunoMatricular,cursoEscolhido)
                listaMatriculas.add(novaMatricula)
                println("Matrícula realizada com sucesso!"+novaMatricula)
            }else{
                println("Não foi possível realizar a matrícula porque não há vagas.")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto:
    Int){
        var pTitular:Professor?= null
        var pAdjunto:Professor?= null
        var cursoEscolhido:Curso?= null

        for(prof in listaProfessores){
            if(prof.codigoDeProfessor == codigoProfessorTitular){
                pTitular=prof
            }
            if(prof.codigoDeProfessor == codigoProfessorAdjunto){
                pAdjunto = prof
            }
            if(pTitular != null && pAdjunto != null){
                break
            }
        }

        for(c in listaCursos){
            if(c.codigoDeCurso == codigoCurso){
               cursoEscolhido = c
                break
            }
        }


        var possiveisErros: String?= null

        if(pTitular == null){
            possiveisErros+="Professor titular não localizado com o código $codigoProfessorTitular -"
        }
        else if(pAdjunto == null){
            possiveisErros+= "Professor adjunto não localizado com o código $codigoProfessorAdjunto -"
        }
        else if(cursoEscolhido == null){
            possiveisErros+="Curso não localizado com o código  $codigoCurso -"
        }

        else if(possiveisErros != null){
            println(possiveisErros)
        }else{
            cursoEscolhido.profTitutar=pTitular as ProfTitutar
            cursoEscolhido.profAdjunto=pAdjunto as ProfAdjunto

        }


    }




}