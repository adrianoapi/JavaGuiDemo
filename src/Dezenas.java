import java.util.Random;

public class Dezenas {

	/**
	 * Gera um array de dezenas sem repetição
	 * 
	 * @return
	 */
	public static int[] gerarDezenas() {

		Dezenas dez = new Dezenas();

		int[] dezenas = new int[6];
		Random random = new Random();

		int i = 0;
		int numero = 0;
		while (i < dezenas.length) {
			numero = random.nextInt(10);
			if (dez.checaArray(dezenas, numero) == false) {
				dezenas[i] = numero;
				++i;
			}

		}

		return dezenas;
	}

	/**
	 * Converte um array em string
	 * 
	 * @param data
	 * @return
	 */
	public String drawTable(int[] data) {

		String numeros = new String();
		for (int i = 0; i < data.length; i++) {
			numeros += "," + data[i];
		}
		return numeros;
	}

	public static boolean checaArray(int[] data, int value) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return true;
			}
		}
		return false;
	}

}
