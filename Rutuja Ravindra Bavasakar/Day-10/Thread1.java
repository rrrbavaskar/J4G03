package begin10;

public class Thread1 extends Thread{
      public Thread1() {
    	  this.start();
    	  for(int i=65; i<=90; i++) {
    		  System.out.println("Loop-1: "+ (char)i +" ");
    	  }
      }
      
	public static void main(String[] args) {
		new Thread1();
  }

  public void run() {
	  for(int i=97; i<=122; i++) {
		  System.out.println("Loop-2: "+ (char)i +" ");
	  }
  }
}