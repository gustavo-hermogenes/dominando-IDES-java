/* COMPILADO DE COMENTÁRIOS GERAIS
 * ctr + 3 = pesquisa (lupa)
 * 	- procurar a linguagem e a "perspective" para configurar o ambiente da IDE (caso queira mudar)
 * 	- procurar por "constructor" para utilizar um construtor automático com os campos do Gato (generate constructor...)
 * 	- "gas" para gerar os getters and setters
 * 	- "equals" para gerar hashcode() and equals()
 * 	- "tostring" para gerar o toString()
 * mudar um bloco selecionado de lugar: segurar alt e mover com a seta
 * "sysout" + ctrl + space = para printar
 * ctrl + shift + f = identação automática (Java roda mesmo sem identação)
 * ctrl + shift + o = cria o import automático do pacote utilizado
 */

package primeiroPacote.model;

import java.util.Objects;

/* Digitando ctrl+3, abre a pesquisa (o equivalente a clicar na lupinha) */
/* - sysout = para a função printar*/

public class Gato {
	
	private String nome;
	private String cor;
	private Integer idade;

	public Gato() {}

	/* - constru = para criar um construtor automaticamente (generate constructor using fields)*/
	
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/* - ggas = generate getters and setters: criar getters and setters */

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	/* equals = generate equals and hash code : criar o equals e o hash code */
	
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	/* toString = generate toString() */	

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	/* selecionar o bloco e alt+seta para cima/baixo para reposicionar no código.
	 * ctrl+shift+f faz a identação automaticamente (apesar de não ser necessário já que Java não considera identação
	 */
	
}
