public class PrincipalTurmas {

    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProcessora = "Tia Maria";

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 3;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Miguel";
        aluno3.idade = 3;

        turmaB.adicionarAluno(aluno);
        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno3);

        turmaB.removerAluno(1);

        turmaB.imprimirListaDeAlunos();
    }

}
