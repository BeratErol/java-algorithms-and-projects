import java.util.InputMismatchException;
import java.util.Scanner;

	class CustomExcept extends Exception {
			public CustomExcept(String message) {
					super(message);
			}
	}

	public class GelismisHesapMakinesi {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int islem = 0, a = 0, b = 0, sonuc = 0;

			while (true) {
				try {
					System.out.print("Ä°ÅŸlem seÃ§iniz: ");
					System.out.println("Toplama iÃ§in 1, Ã‡Ä±karma iÃ§in 2, BÃ¶lme iÃ§in 3, Ã‡arpma iÃ§in 4 seÃ§iniz.");
					islem = scanner.nextInt();

					if (islem > 4 || islem < 0) {
						throw new CustomExcept("GeÃ§ersiz iÅŸlem seÃ§ildi!");
					}
					break;
				} catch (InputMismatchException e) {
					System.out.println("Veri tipi farklÄ±! LÃ¼tfen bir sayÄ± giriniz.");
					scanner.next();
				} catch (CustomExcept e) {
					System.out.println(e.getMessage());
				}
			}

			while (true) {
				try {
					System.out.print("Ä°lk sayÄ±yÄ± giriniz: ");
					a = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Veri tipi farklÄ±! LÃ¼tfen bir sayÄ± giriniz.");
					scanner.next();
				}
			}

			while (true) {
				try {
					System.out.print("Ä°kinci sayÄ±yÄ± giriniz: ");
					b = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Veri tipi farklÄ±! LÃ¼tfen bir sayÄ± giriniz.");
					scanner.next();
				}
			}

			switch (islem) {
			case 1:
				try {
					sonuc = a + b;
					if (sonuc > 9999) {
						throw new CustomExcept("SayÄ± sÄ±nÄ±rÄ± aÅŸÄ±ldÄ±!");
					}
					System.out.println("SonuÃ§: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				try {
					sonuc = a - b;
					if (sonuc > 9999) {
						throw new CustomExcept("SayÄ± sÄ±nÄ±rÄ± aÅŸÄ±ldÄ±!");
					}
					System.out.println("SonuÃ§: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				try {
					if (b == 0) {
						throw new ArithmeticException("BÃ¶lme hatasÄ±: SÄ±fÄ±ra bÃ¶lme.");
					}
					sonuc = a / b;
					if (sonuc > 9999) {
						throw new CustomExcept("SayÄ± sÄ±nÄ±rÄ± aÅŸÄ±ldÄ±!");
					}
					System.out.println("SonuÃ§: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				try {
					sonuc = a * b;
					if (sonuc > 9999) {
						throw new CustomExcept("SayÄ± sÄ±nÄ±rÄ± aÅŸÄ±ldÄ±!");
					}
					System.out.println("SonuÃ§: " + sonuc);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		}
}
