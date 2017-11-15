import java.util.Random;

public class Dezenas {
	
	public static int gerarDezenas(){
		Random random = new Random();
		return random.nextInt(10);
	}

}
