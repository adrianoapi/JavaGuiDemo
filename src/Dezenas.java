import java.util.Random;

public class Dezenas {

	/**
	 * Gera um array de dezenas sem repetição
	 * @return
	 */
	public static int[] gerarDezenas() {

		int[] dezenas = new int[6];
		Random random = new Random();
		
		int i = 0;
		while(i < dezenas.length){
			dezenas[i] = random.nextInt(10);
			++i;
		}

		return dezenas;
	}

	/**
	 * Converte um array em string
	 * @param data
	 * @return
	 */
	public String drawTable(int[] data) {

		String numeros = new String();
		for (int i = 0; i < data.length; i++) {
			numeros += ","+ data[i];
		}
		return numeros;
	}

}
