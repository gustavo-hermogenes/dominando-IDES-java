package primeiroPacote;

import primeiroPacote.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, Java World!");
		System.out.println("Vou montar, como um primeiro programa java na IDE eclipse, um modelo de gato.");
		
		Gato gato = new Gato();
		/* para gerar o objeto Gato é preciso importar a class Gato do pacote correspondente
		 * ctrl+shift+o = importa automaticamente o pacote
		 */
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);		
	}

}
	
class Livros { 
	/* como esta class está dentro do mesmo arquivo, não preciso importá-la como ocorreu com a class Gato*/
	private String nome;
	private String npag;
}