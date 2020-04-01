package projetoJava.classes;

import java.util.ArrayList;
import java.util.List;

import projetoJava.constantes.StatusAluno;

public class Aluno {
	/*esses são os atributos do Aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String rg;
	private String cpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	/*private Disciplina disciplina = new Disciplina();*/
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	/*public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}*/
	
	/*construtor, cria os dados na memoria, sendo padrão do java*/
	public Aluno() {
		
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		
	}
	
	/*getters e setters do objeto*/
	/*SET é para adicionar ou receber dados para os atributos*/
	/*GET é para resgatar ou obter o valor do atributo*/
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	/*recebe os dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*resgata os dados*/
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	/*metodo que retorna a media do aluno*/
	public double getMediaNota() {
		double somaNotas = 0.0;
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota1();
		}
		return somaNotas / disciplinas.size() /*(disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4*/;
	}
	
	/*metodo que retorna true para aprovado ou false para reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*metodo que retorna uma string*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;//"Aluno esta aprovado";
			}
			else {
				return StatusAluno.RECUPERACAO;//"Aluno esta em recuperação";
			}
		}
		else {
			return StatusAluno.REPROVADO;//"Aluno esta reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplina=" + disciplinas
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
