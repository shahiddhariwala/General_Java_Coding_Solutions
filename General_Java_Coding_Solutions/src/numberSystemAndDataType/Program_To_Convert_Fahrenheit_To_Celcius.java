package numberSystemAndDataType;

public class Program_To_Convert_Fahrenheit_To_Celcius {

	public static void main(String[] args) {
		// C = (5/9)(F-32);
		
		for (int i = 0; i <= 300; i+=20) {
			int C = 0;
			int F = i;
			C = (int)(((double)5/9)*(F-32));
			System.out.println("F = "+F+"\tC = "+C);
		}

	}

}
