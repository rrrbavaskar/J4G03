package patterns;

public class AlphabeticalPalindromeTriangle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 int n = 7;
			 String[] array = {"a","b","c","d","e","f","g","h","i","j"};
		       for(int i=1; i<=n; i++) {
		           //spaces
		           for(int j=1; j<=n-i; j++) {
		               System.out.print("   ");
		           }
		 
		           //first part
		           for(int j=i; j>=1; j--) {
		               System.out.print(" "+array[j-1]+" ");
		           }
		 
		           //second part
		           for(int j=2; j<=i; j++) {
		               System.out.print(" "+array[j-1]+" ");
		           }
		           System.out.println();
		       }
		}

	}


