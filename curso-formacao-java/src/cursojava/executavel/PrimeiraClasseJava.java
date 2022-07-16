package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args)
	{

		// new Aluno() é uma INSTÂNCIA (criação de objeto)
		// aluno1 é uma referência para o objeto
		
		/* CRIAÇÃO ALUNO */
		
		Aluno aluno = new Aluno("Allan", 19);

		aluno.setDataNascimento("10/05/2003");
		aluno.setNomeMae("Keila");
		aluno.setNomePai("Alan");
		aluno.setRegistroGeral("MG sei la oq");
		aluno.setNumeroCpf("12662341602");
		aluno.setNomeEscola("JDev Treinamento");
		
		/* DISCIPLINAS ALUNO2 */

		for (int pos = 1; pos <= 3; pos++)
		{
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+":");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+":");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0)
		{
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4?");
			
			aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue());
		}
		
		JOptionPane.showMessageDialog(null, "DISCIPLINAS: " + aluno.getDisciplinas());
		
		JOptionPane.showMessageDialog(null,
				String.format("A média do aluno " + aluno.getNome() + " é %.2f", aluno.getMediaNota()));

	}
}
