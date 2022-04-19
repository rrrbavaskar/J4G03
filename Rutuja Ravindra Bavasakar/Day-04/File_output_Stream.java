package j4g03.day04;

import java.io.FileOutputStream;  

public class File_output_Stream {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 try{    
	             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}   
		}

	}
	


