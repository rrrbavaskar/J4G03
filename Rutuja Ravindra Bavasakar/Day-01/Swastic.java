package abc;

public class Swastic {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				String fill = "  ";
				for (int i = 1; i <= 11; i++) {
					if (i == 1) {
						for (int j = 1; j <= 11; j++) {
							if (j <= 6)
								fill = "* ";
							else if (j == 11)
								fill = "* ";
							else
								fill = "  ";
							System.out.print(fill);
						}
					} else if (i > 1 && i < 6) {
						for (int j = 1; j <= 11; j++) {
							if (j == 6)
								fill = "* ";
							else if (j == 11)
								fill = "* ";
							else
								fill = "  ";
							System.out.print(fill);
						}
					} else if (i == 6) {
						fill = "* ";
						for (int j = 1; j <= 11; j++) {
							System.out.print(fill);
						}
					} else if (i > 6 && i < 11) {
						for (int j = 1; j <= 11; j++) {
							if (j == 1)
								fill = "* ";
							else if (j == 6)
								fill = "* ";
							else
								fill = "  ";
							System.out.print(fill);
						}
					} else if (i == 11) {
						for (int j = 1; j <= 11; j++) {
							if (j == 1)
								fill = "* ";
							else if (j >= 6)
								fill = "* ";
							else
								fill = "  ";
							System.out.print(fill);
						}
					}
					System.out.println();
				}

		}

	}


