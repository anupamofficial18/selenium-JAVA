      
      
    import java.io.FileReader;  
    public class File_Readear_Example {  
        
    	public static void main(String args[])throws Exception {
        	
              FileReader fr=new FileReader("D:\\testout.txt.txt");    
              int i;    
              while((i=fr.read())!=-1)    
              System.out.print((char)i);    
              fr.close();    
        }    
    }    