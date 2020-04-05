package numberSystemAndDataType;

/*F = 0	C = -17
F = 20	C = -6
F = 40	C = 4
F = 60	C = 15
F = 80	C = 26
F = 100	C = 37
F = 120	C = 48
F = 140	C = 60
F = 160	C = 71
F = 180	C = 82
F = 200	C = 93
F = 220	C = 104
F = 240	C = 115
F = 260	C = 126
F = 280	C = 137
F = 300	C = 148
*/
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
