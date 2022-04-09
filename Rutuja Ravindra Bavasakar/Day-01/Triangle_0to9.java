package abc;

public class Triangle_0to9 {
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 9; i++) { int number = 1; for (int j = 9; j > i; j--)
		        {
		            System.out.print(" ");
		        }
		        for (int k = 0; k <= i; k++)
		        {
		            System.out.print((int) (number + k) + " ");
		        }
		        System.out.println();
		    }

			}

	}

