package day01;

public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1000;
		int end = 2000;
		boolean yn;
		int count = 0;
		for(int i=start;i<=end;i++) {
			yn=true;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
				  yn=false;
				  break;
		    }

	    }
			if(yn) {
		    System.out.print(i+" ");
		    count++;
		       if(count==15) {
		         System.out.println();
		         count =0;              
	            }
		  }
	 }
  }
}

