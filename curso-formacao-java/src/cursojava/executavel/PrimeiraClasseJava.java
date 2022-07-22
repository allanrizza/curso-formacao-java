package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		if(login.equals("admin") && senha.equals("admin"))
		{
		
		List<Aluno> alunos = new ArrayList<>();
		
		/* É uma lista onde temos uma chave que identifica uma sequência de valores	também */
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		

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
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		
		for (Aluno aluno : alunos)
		{
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("----------- Lista dos alunos aprovados ------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("Média: " + aluno.getMediaNota());
		}
		
		System.out.println("----------- Lista dos alunos em recuperação ------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("Média: " + aluno.getMediaNota());
		}
		
		System.out.println("----------- Lista dos alunos reprovados ------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("Média: " + aluno.getMediaNota());
		}

	}
		else {
			JOptionPane.showMessageDialog(null, "LOGIN E/OU SENHA INCORRETOS.");
		}
}
}
