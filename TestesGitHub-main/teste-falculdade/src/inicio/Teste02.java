package inicio;

public class Teste02 {

	// Cria os atributos a serem usados
	private String senha = null;

	public Teste02() {

	}

	public void validarSenha() {

		if (!this.senhaQntCaracteres()) {
			System.out.println("Informe uma senha que tenha no mínimo 6 caracteres.");
		} else if (!this.senhaPossuiDigito()) {
			System.out.println("Informe uma senha que tenha no mínimo 1 digito.");
		} else if (!this.senhaPossuiMaiuscula()) {
			System.out.println("Informe uma senha que tenha no mínimo 1 letra maiúsculo.");
		} else if (!this.senhaPossuiMinuscula()) {
			System.out.println("Informe uma senha que tenha no mínimo 1 letra minúsculo.");
		} else if (!this.senhaPossuiCaracteresEspeciais()) {
			System.out.println("Informe uma senha que tenha no mínimo 1 caractere especial.");
		}else {
			
			System.out.println("Sua senha é forte");
			
		}

	}

	// Verifica se a senha possui 6 Caracters
	private boolean senhaQntCaracteres() {
		if (this.senha.length() >= 6) {
			return true;
		} else {
			return false;
		}
	}

	// Verifica se a senha possui digitos
	private boolean senhaPossuiDigito() {

		// cria um array de char
		char[] caracteres = this.senha.toCharArray();
		boolean validar = false;

		// Faz o loop até o fim da lista
		for (int i = 0; i < caracteres.length; i++) {

			// verifica se o char é um digito
			if (Character.isDigit(caracteres[i])) {
				validar = true;
				break;
			}

		}

		return validar;

	}

	// Verifica se a senha possui letras maiusculas
	private boolean senhaPossuiMaiuscula() {

		// cria um array de char
		char[] caracteres = this.senha.toCharArray();
		boolean validar = false;

		// Faz o loop até o fim da lista
		for (int i = 0; i < caracteres.length; i++) {

			// verifica se o char é um digito
			if (Character.isUpperCase(caracteres[i])) {
				validar = true;
				break;
			}

		}

		return validar;

	}

	// Verifica se a senha possui letras maiusculas
	private boolean senhaPossuiMinuscula() {

		// cria um array de char
		char[] caracteres = this.senha.toCharArray();
		boolean validar = false;

		// Faz o loop até o fim da lista
		for (int i = 0; i < caracteres.length; i++) {

			// verifica se o char é um digito
			if (Character.isLowerCase(caracteres[i])) {
				validar = true;
				break;
			}

		}

		return validar;

	}

	private boolean senhaPossuiCaracteresEspeciais() {

		// Cria um array de char com a senha
		char[] caracteres = this.senha.toCharArray();
		char[] caracteresEspeciais = "!@#$%^&*()-+".toCharArray();
		boolean validar = false;
		boolean confirmar = false;

		// Faz um loop até o fim da lista de caracteres especiais
		for (int i = 0; i < caracteresEspeciais.length; i++) {

			// Percorre a lista de caracteres da senha
			for (int j = 0; j < caracteres.length; j++) {

				// Verifica se algum dos caracteres contem na senha
				if (Character.valueOf(caracteres[j]) == Character.valueOf(caracteresEspeciais[i])) {
					validar = true;
					confirmar = true;
					break;
				}

			}

			// Verifica se a algum caractere especial e sai do loop
			if (confirmar == true) {
				break;
			}

		}

		return validar;

	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
