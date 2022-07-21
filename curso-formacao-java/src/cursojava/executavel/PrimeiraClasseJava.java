package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		
		List<Aluno> alunosAprovados = new ArrayList<>();
		List<Aluno> alunosRecuperacao = new ArrayList<>();
		List<Aluno> alunosReprovados = new ArrayList<>();


		for (int qtd = 1; qtd <= 5; qtd++) {

			// new Aluno() é uma INSTÂNCIA (criação de objeto)
			// aluno1 é uma referência para o objeto

			/* CRIAÇÃO ALUNO */

			Aluno aluno = new Aluno();
			
			aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
			
			aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite a idade do aluno: ")));

			aluno.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF do aluno: "));
			
			aluno.setNomeEscola("JDev Treinamento");

			/* DISCIPLINAS ALUNO */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + ":");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + ":");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog(null, "Qual a disciplina? 1,2,3 ou 4?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno);
		}
		
		for (Aluno aluno : alunos)
		{
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			} else {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("----------- Lista dos alunos aprovados ------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("Média: " + aluno.getMediaNota());
		}
		
		System.out.println("----------- Lista dos alunos em recuperação ------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("Média: " + aluno.getMediaNota());
		}
		
		System.out.println("----------- Lista dos alunos reprovados ------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("Média: " + aluno.getMediaNota());
		}

	}
}
