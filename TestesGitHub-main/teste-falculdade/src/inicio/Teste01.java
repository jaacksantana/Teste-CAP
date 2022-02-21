package inicio;

public class Teste01 {
	
	private static int valor;
	
	public Teste01() {
		

	}
	
	public void RealizarTeste() {
		
		// Cria os atributos
		int contarEspaco = 1;
		
		// Percorre as linhas
		for (int x = 1; x<=valor;x++) {
			
			// Percorre as colunas
			for (int y = 1;y<=valor;y++) {
				
				if (contarEspaco == x) {
					System.out.println(AdicionarEspacoAndAsterisco(contarEspaco));
					contarEspaco ++;
				}

			}

		}
	}
	
	private static String AdicionarEspacoAndAsterisco(int ContadorEspaco) {
		
		char n = '*';
		String armazena = "";

		// Percorre para adicioar os espacos
		for (int i = 1 ; i <= valor - ContadorEspaco; i++){
			armazena += " ";	
		}
		
		// Percorre para adicionar o n
		for (int j = 1 ; j<= ContadorEspaco; j++){
			armazena += n;
		}
		
		return armazena;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
