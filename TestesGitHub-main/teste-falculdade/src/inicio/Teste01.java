package inicio;

public class Teste01 {
	
	public Teste01() {
		
		// Cria os atributos
		int contarEspaco = 1;
		
		// Percorre as linhas
		for (int x = 1; x<=6;x++) {
			
			// Percorre as colunas
			for (int y = 1;y<=6;y++) {
				
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
		for (int i = 1 ; i <= 6 - ContadorEspaco; i++){
			armazena += " ";	
		}
		
		// Percorre para adicionar o n
		for (int j = 1 ; j<= ContadorEspaco; j++){
			armazena += n;
		}
		
		return armazena;
	}
	
}
