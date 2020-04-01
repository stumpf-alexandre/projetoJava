package projetoJava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import projetoJava.classes.Aluno;
import projetoJava.classes.Disciplina;
import projetoJava.constantes.StatusAluno;

public class ExecutavelAluno {
	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
		
			/*Objeto ainda não existe na memoria
			Aluno aluno1;*/
			
			/*Agora temos um objeto real na memoria
			Aluno aluno2 = new Aluno();*/
			
			/*new Aluno() é uma instancia (criação de objeto)*/
			/*aluno1 é uma referencia para o objeto Aluno*/
			
			/*Aluno aluno1 = new Aluno(); aqui sera joão
			aluno1.nome = "João";
			aluno1.idade = 50;
			
			System.out.println("Nome do aluno 1 é = " + aluno1.nome + " e tem a idade de " + aluno1.idade + " anos.");*/
			
			Aluno aluno2 = new Aluno();/*aqui sera pedro*/
			aluno2.setNome("Pedro");
			aluno2.setIdade(50);
			aluno2.setDataNascimento("18/10/1987");
			aluno2.setRg("44554.4445.455");
			aluno2.setCpf("999999999-99");
			aluno2.setNomeMae("Maria");
			aluno2.setNomePai("Antonio");
			aluno2.setDataMatricula("10/01/2019");
			aluno2.setSerieMatriculado("5");
			aluno2.setNomeEscola("João Paulo II");
			
			Disciplina disciplina1 = new Disciplina();
			
			disciplina1.setNomeDisciplina("Banco de Dados");
			disciplina1.setNota1(90);
			
			aluno2.getDisciplinas().add(disciplina1);
			
			Disciplina disciplina2 = new Disciplina();
			
			disciplina2.setNomeDisciplina("Matemática");
			disciplina2.setNota1(80);
			
			aluno2.getDisciplinas().add(disciplina2);
			
			Disciplina disciplina3 = new Disciplina();
			
			disciplina3.setNomeDisciplina("Geografia");
			disciplina3.setNota1(97);
			
			aluno2.getDisciplinas().add(disciplina3);
			
			Disciplina disciplina4 = new Disciplina();
			
			disciplina4.setNomeDisciplina("Java Web");
			disciplina4.setNota1(70);
			
			aluno2.getDisciplinas().add(disciplina4);
			
			/*aluno2.getDisciplina().setNota1(90);
			aluno2.getDisciplina().setNota2(80.8);
			aluno2.getDisciplina().setNota3(70.9);
			aluno2.getDisciplina().setNota4(90.7);*/
			
			System.out.println("Nome = " + aluno2.getNome());
			System.out.println("Idade = " + aluno2.getIdade());
			System.out.println("Data de nascimento = " + aluno2.getDataNascimento());
			System.out.println("RG = " + aluno2.getRg());
			System.out.println("CPF = " + aluno2.getCpf());
			System.out.println("Nome da mãe = " + aluno2.getNomeMae());
			System.out.println("Nome do pai = " + aluno2.getNomePai());
			System.out.println("Data da matricula = " + aluno2.getDataMatricula());
			System.out.println("Série matriculado = " + aluno2.getSerieMatriculado());
			System.out.println("Nome da escola = " + aluno2.getNomeEscola());
			System.out.println("Média do aluno é = " + aluno2.getMediaNota());
			System.out.println("Resultado = " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			System.out.println(aluno2.getAlunoAprovado2());
			
			System.out.println("-------------------------------");
			
			Aluno aluno3 = new Aluno();/*aqui sera alex*/
			aluno3.setNome("Alex");
			aluno3.setIdade(12);
			aluno3.setDataNascimento("18/07/2008");
			aluno3.setRg("44554.4445.455");
			aluno3.setCpf("999999999-99");
			aluno3.setNomeMae("Joana");
			aluno3.setNomePai("Mario");
			aluno3.setDataMatricula("10/01/2019");
			aluno3.setSerieMatriculado("7");
			aluno3.setNomeEscola("Antonio Krass");
			
			System.out.println("Nome = " + aluno3.getNome());
			System.out.println("Idade = " + aluno3.getIdade());
			System.out.println("Data de nascimento = " + aluno3.getDataNascimento());
			System.out.println("RG = " + aluno3.getRg());
			System.out.println("CPF = " + aluno3.getCpf());
			System.out.println("Nome da mãe = " + aluno3.getNomeMae());
			System.out.println("Nome do pai = " + aluno3.getNomePai());
			System.out.println("Data da matricula = " + aluno3.getDataMatricula());
			System.out.println("Série matriculado = " + aluno3.getSerieMatriculado());
			System.out.println("Nome da escola = " + aluno3.getNomeEscola());
			
			System.out.println("-------------------------------");
			
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			HashMap<String/*valor da chave*/, List<Aluno>> maps = new HashMap<String, List<Aluno>>();//é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores
			
			/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
			
			for(int qtd = 1; qtd <= 2; qtd++) {
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ? ");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno " + qtd + " ? ");
				String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno " + qtd + " ? ");
				String rg = JOptionPane.showInputDialog("Qual o RG do aluno " + qtd + " ? ");
				String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno " + qtd + " ? ");
				String nomeMae = JOptionPane.showInputDialog("Qual o nome da mão do aluno " + qtd + " ? ");
				String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno " + qtd + " ? ");
				String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula do aluno " + qtd + " ? ");
				String serieMatriculada = JOptionPane.showInputDialog("Qual a série matriculada do aluno " + qtd + " ? ");
				String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola matriculada do aluno " + qtd + " ? ");
				/*String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina do aluno? ");
				String nota1 = JOptionPane.showInputDialog("Qual a nota do 1º semestre do aluno? ");
				String nota2 = JOptionPane.showInputDialog("Qual a nota do 2º semestre do aluno? ");
				String nota3 = JOptionPane.showInputDialog("Qual a nota do 3º semestre do aluno? ");
				String nota4 = JOptionPane.showInputDialog("Qual a nota do 4º semestre do aluno? ");*/
				
				Aluno aluno4 = new Aluno();
				
				aluno4.setNome(nome);
				aluno4.setIdade(Integer.valueOf(idade));
				aluno4.setDataNascimento(dataNascimento);
				aluno4.setRg(rg);
				aluno4.setCpf(cpf);
				aluno4.setNomeMae(nomeMae);
				aluno4.setNomePai(nomePai);
				aluno4.setDataMatricula(dataMatricula);
				aluno4.setSerieMatriculado(serieMatriculada);
				aluno4.setNomeEscola(nomeEscola);
				/*aluno4.getDisciplina().setNomeDisciplina(nomeDisciplina);
				aluno4.getDisciplina().setNota1(Double.parseDouble(nota1));
				aluno4.getDisciplina().setNota2(Double.parseDouble(nota2));
				aluno4.getDisciplina().setNota3(Double.parseDouble(nota3));
				aluno4.getDisciplina().setNota4(Double.parseDouble(nota4));*/
				
				for (int pos = 1; pos <= 4; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +"? ");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos +"? ");
					
					Disciplina disciplina = new Disciplina();
					disciplina.setNomeDisciplina(nomeDisciplina);
					disciplina.setNota1(Double.valueOf(notaDisciplina));
					
					aluno4.getDisciplinas().add(disciplina);
				}
				
				System.out.println("Nome = " + aluno4.getNome());
				System.out.println("Idade = " + aluno4.getIdade());
				System.out.println("Data de nascimento = " + aluno4.getDataNascimento());
				System.out.println("RG = " + aluno4.getRg());
				System.out.println("CPF = " + aluno4.getCpf());
				System.out.println("Nome da mãe = " + aluno4.getNomeMae());
				System.out.println("Nome do pai = " + aluno4.getNomePai());
				System.out.println("Data da matricula = " + aluno4.getDataMatricula());
				System.out.println("Série matriculado = " + aluno4.getSerieMatriculado());
				System.out.println("Nome da escola = " + aluno4.getNomeEscola());
				System.out.println("Média do aluno é = " + aluno4.getMediaNota());
				System.out.println("Resultado = " + (aluno4.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
				System.out.println(aluno4.getAlunoAprovado2());
				
				System.out.println(aluno4.toString());/*demonstra os dados mais simplificado com toString*/
				
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
				
				if(escolha == 0) {
					int continuarRemovendo = 0;
					int posicao = 1;
					while(continuarRemovendo == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
						aluno4.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao ++;
						//System.out.println(aluno4.toString());
						continuarRemovendo = JOptionPane.showConfirmDialog(null, "Continuar a remover");
					}
				}
				alunos.add(aluno4);
			}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno");
			
			if(escolha == 0) {
				int continuarRemovendo = 0;
				while(continuarRemovendo == 0) {
					String nome = JOptionPane.showInputDialog("Qual o nome do aluno para remover da lista? ");
					for (Aluno aluno : alunos) {
						if(aluno.getNome().equalsIgnoreCase(nome)) {//remove o aluno pela igualdade do nome
							alunos.remove(aluno);
							break;
						}
						else {
							System.out.println(aluno);/*descrição do objeto na memoria*/
							System.out.println("Média do aluno é = " + aluno.getMediaNota());
							System.out.println(aluno.getAlunoAprovado2());
							System.out.println("------------------------------------------------------------------------------");
						}
					}
					continuarRemovendo = JOptionPane.showConfirmDialog(null, "Continuar a remover");
				}
			}
			else {
				for (Aluno aluno : alunos) {
					System.out.println(aluno);/*descrição do objeto na memoria*/
					System.out.println("Média do aluno é = " + aluno.getMediaNota());
					System.out.println(aluno.getAlunoAprovado2());
					System.out.println("------------------------------------------------------------------------------");
				}
			}
			
			int substituicao = JOptionPane.showConfirmDialog(null, "Deseja substituir algum aluno");
			
			if(substituicao == 0) {
				int continuarSub = 0;
				while(continuarSub == 0) {
					String nome = JOptionPane.showInputDialog("Qual o nome do aluno para substituir da lista? ");
					for (int poss = 0; poss < alunos.size(); poss++) {
						Aluno aluno = alunos.get(poss);
						if(aluno.getNome().equalsIgnoreCase(nome)) {//substituir o aluno pela igualdade do nome e posição
							Aluno troca = new Aluno();
							String nomeSub = JOptionPane.showInputDialog("Qual o nome do aluno ? ");
							String idadeSub = JOptionPane.showInputDialog("Qual a idade do aluno ? ");
							String dataNascimentoSub = JOptionPane.showInputDialog("Qual a data de nascimento do aluno ? ");
							String rgSub = JOptionPane.showInputDialog("Qual o RG do aluno ? ");
							String cpfSub = JOptionPane.showInputDialog("Qual o CPF do aluno ? ");
							String nomeMaeSub = JOptionPane.showInputDialog("Qual o nome da mão do aluno ? ");
							String nomePaiSub = JOptionPane.showInputDialog("Qual o nome do pai do aluno ? ");
							String dataMatriculaSub = JOptionPane.showInputDialog("Qual a data da matricula do aluno ? ");
							String serieMatriculadaSub = JOptionPane.showInputDialog("Qual a série matriculada do aluno ? ");
							String nomeEscolaSub = JOptionPane.showInputDialog("Qual o nome da escola matriculada do aluno ? ");
							troca.setNome(nomeSub);
							troca.setIdade(Integer.valueOf(idadeSub));
							troca.setDataNascimento(dataNascimentoSub);
							troca.setRg(rgSub);
							troca.setCpf(cpfSub);
							troca.setNomeMae(nomeMaeSub);
							troca.setNomePai(nomePaiSub);
							troca.setDataMatricula(dataMatriculaSub);
							troca.setSerieMatriculado(serieMatriculadaSub);
							troca.setNomeEscola(nomeEscolaSub);
							for (int posSub = 1; posSub <= 4; posSub++) {
								String nomeDisciplinaSub = JOptionPane.showInputDialog("Nome da disciplina " + posSub +"? ");
								String notaDisciplinaSub = JOptionPane.showInputDialog("Nota da disciplina " + posSub +"? ");
								
								Disciplina disciplina = new Disciplina();
								disciplina.setNomeDisciplina(nomeDisciplinaSub);
								disciplina.setNota1(Double.valueOf(notaDisciplinaSub));
								
								troca.getDisciplinas().add(disciplina);
							}
							int escolhaSub = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
							
							if(escolhaSub == 0) {
								int continuarSubs = 0;
								int posicao = 1;
								while(continuarSubs == 0) {
									String disciplinaSubs = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
									aluno.getDisciplinas().remove(Integer.valueOf(disciplinaSubs).intValue() - posicao);
									posicao ++;
									//System.out.println(aluno4.toString());
									continuarSubs = JOptionPane.showConfirmDialog(null, "Continuar a remover");
								}
							}
							alunos.set(poss, troca);
							aluno = alunos.get(poss);
							break;
						}
						else {
							System.out.println(aluno);/*descrição do objeto na memoria*/
							System.out.println("Média do aluno é = " + aluno.getMediaNota());
							System.out.println(aluno.getAlunoAprovado2());
							System.out.println("------------------------------------------------------------------------------");
						}
					}
					continuarSub = JOptionPane.showConfirmDialog(null, "Continuar a substituir");
				}
			}
			else {
				for (Aluno aluno : alunos) {
					System.out.println(aluno);/*descrição do objeto na memoria*/
					System.out.println("Média do aluno é = " + aluno.getMediaNota());
					System.out.println(aluno.getAlunoAprovado2());
					System.out.println("------------------------------------------------------------------------------");
				}
			}
			
			for (Aluno aluno : alunos) {
				System.out.println("Alunos que sobraram na lista");
				System.out.println(aluno.getNome());
				System.out.println("Suas materias são");
				for (Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println(disciplina.getNomeDisciplina());
				}
			}
			
			for(int pos = 0; pos < alunos.size(); pos++) {//lista de alunos pela posição
				Aluno aluno = alunos.get(pos);
				System.out.println("Aluno : " + aluno.getNome());
				for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
					Disciplina disc = aluno.getDisciplinas().get(posd);
					System.out.println("Matéria : " + disc.getNomeDisciplina() + ", nota : " + disc.getNota1());
				}
				System.out.println("Media de " + aluno.getNome() + " : " + aluno.getMediaNota());
				System.out.println(aluno.getAlunoAprovado2());
				System.out.println("------------------------------------------------------------------------");
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			
			for (Aluno aluno : alunos) {//lista de alunos aprovados, em recuperação e reprovados
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					//alunosAprovados.add(aluno);
					maps.get(StatusAluno.APROVADO).add(aluno);
				}
				else { 
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						//alunosRecuperacao.add(aluno);
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}
					else {
						//alunosReprovados.add(aluno);
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}
			}
			
			System.out.println("---------------Lista dos aprovados------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)/*alunosAprovados*/) {
				System.out.println("Aluno " + aluno.getNome() + ", esta " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
			}
			
			System.out.println("---------------Lista dos reprovados------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)/*alunosReprovados*/) {
				System.out.println("Aluno " + aluno.getNome() + ", esta " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
			}
			
			System.out.println("---------------Lista dos em recuperação------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)/*alunosRecuperacao*/) {
				System.out.println("Aluno " + aluno.getNome() + ", esta em " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
			}
			
			/*System.out.println("-------------------------------");
			
			String nome1 = JOptionPane.showInputDialog("Qual o nome do aluno? ");
			String idade1 = JOptionPane.showInputDialog("Qual a idade do aluno? ");
			String dataNascimento1 = JOptionPane.showInputDialog("Qual a data de nascimento do aluno? ");
			String rg1 = JOptionPane.showInputDialog("Qual o RG do aluno? ");
			String cpf1 = JOptionPane.showInputDialog("Qual o CPF do aluno? ");
			String nomeMae1 = JOptionPane.showInputDialog("Qual o nome da mão do aluno? ");
			String nomePai1 = JOptionPane.showInputDialog("Qual o nome do pai do aluno? ");
			String dataMatricula1 = JOptionPane.showInputDialog("Qual a data da matricula do aluno? ");
			String serieMatriculada1 = JOptionPane.showInputDialog("Qual a série matriculada do aluno? ");
			String nomeEscola1 = JOptionPane.showInputDialog("Qual o nome da escola matriculada do aluno? ");
			String nomeDisciplina1 = JOptionPane.showInputDialog("Qual o nome da disciplina do aluno? ");
			String nota11 = JOptionPane.showInputDialog("Qual a nota do 1º semestre do aluno? ");
			String nota21 = JOptionPane.showInputDialog("Qual a nota do 2º semestre do aluno? ");
			String nota31 = JOptionPane.showInputDialog("Qual a nota do 3º semestre do aluno? ");
			String nota41 = JOptionPane.showInputDialog("Qual a nota do 4º semestre do aluno? ");
			
			Aluno aluno = new Aluno();
			
			aluno.setNome(nome1);
			aluno.setIdade(Integer.valueOf(idade1));
			aluno.setDataNascimento(dataNascimento1);
			aluno.setRg(rg1);
			aluno.setCpf(cpf1);
			aluno.setNomeMae(nomeMae1);
			aluno.setNomePai(nomePai1);
			aluno.setDataMatricula(dataMatricula1);
			aluno.setSerieMatriculado(serieMatriculada1);
			aluno.setNomeEscola(nomeEscola1);
			aluno.getDisciplina().setNomeDisciplina(nomeDisciplina1);
			aluno.getDisciplina().setNota1(Double.parseDouble(nota11));
			aluno.getDisciplina().setNota2(Double.parseDouble(nota21));
			aluno.getDisciplina().setNota3(Double.parseDouble(nota31));
			aluno.getDisciplina().setNota4(Double.parseDouble(nota41));
			
			System.out.println(aluno.toString());demonstra os dados mais simplificado com toString
			System.out.println("Média do aluno é = " + aluno.getMediaNota());
			System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			System.out.println(aluno.getAlunoAprovado2());
			
			System.out.println("-------------------------------");*/
			
			/*equals e hashcode (Diferenciar e comparar objetos)*/
			Aluno aluno1 = new Aluno();
			aluno1.setNome("Alex");
			aluno1.setIdade(12);
			
			Aluno aluno5 = new Aluno();
			aluno5.setNome("Alex");
			aluno5.setIdade(12);
			
			if(aluno1.equals(aluno5)) {
				System.out.println("Alunos são iguais");
			}
			else {
				System.out.println("Alunos não são iguais");
			}
		}
		else {
			System.out.println("Login e Senha invalidos...");
		}
	}
}
