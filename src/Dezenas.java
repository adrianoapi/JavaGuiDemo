import java.util.Random;

public class Dezenas {

	/**
	 * Gera um array de dezenas sem repetição
	 * 
	 * @return
	 */
	public static int[] gerarDezenas(int x) {

		int[] dezenas = new int[x];
		Random random = new Random();

		int i = 0;
		int numero = 0;
		while (i < dezenas.length) {
			numero = random.nextInt(60) + 1;
			if (checaArray(dezenas, numero) == false) {
				dezenas[i] = numero;
				++i;
			}

		}

		return ordenarArray(dezenas);
	}

	/**
	 * Converte um array em string
	 * 
	 * @param data
	 * @return
	 */
	public String drawTable(int[] data) {

		String numeros = new String();
		String space = new String();
		for (int i = 0; i < data.length; i++) {
			if (i < 1) {
				space = "";
			} else {
				space = " ";
			}
			numeros += space + menorDez(data[i]);
		}
		return numeros;
	}

	public String menorDez(int value) {
		if (value < 10) {
			return "0" + value;
		}
		return "" + value;
	}

	/**
	 * Verifica se a dezena já existe no array
	 * 
	 * @param data
	 * @param value
	 * @return
	 */
	public static boolean checaArray(int[] data, int value) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == value) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Médoto para ordenação do array
	 * 
	 * @param data
	 * @return
	 */
	public static int[] ordenarArray(int[] data) {
		int temp;
		boolean check = false;

		while (check == false) {
			check = true;
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i + 1]) {
					temp = data[i + 1];
					data[i + 1] = data[i];
					data[i] = temp;
					check = false;
				}
			}

		}

		return data;
	}

}
