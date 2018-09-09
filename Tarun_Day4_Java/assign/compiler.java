import java.util.*;
import java.io.File; 
import java.io.FileNotFoundException;
public class compiler {

	 public static void main(String args[]) 
	    { 
		 File file = 
			      new File("new.txt"); 
		 
			    Scanner sc;
				try {
					sc = new Scanner(file);
					while (sc.hasNextLine())
				    {
						String fi="";
		        String str=sc.nextLine();
		        
//		        String str="class ab{"
//		        		+ "float f=1.0"
//		        		+ "public static void main(String args[])"
//		        		+ "{"
//		        		+ "System.out.println"
//		        		+ "}}";
		        String ar[]=str.split(" ");
		        
		        for(int i=0;i<ar.length;i++)
		        {
		        	if(ar[i].equals("int"))
		        		{ar[i]="i_store";break;}
		        	else if(ar[i].equals("float"))
		        		{ar[i]="f_store";break;}
		        	else if(ar[i].equals("new"))
		        		{fi="A_store";break;}
		        	else if(ar[i].contains(");")&&!str.contains("abstract")&&!str.contains("while"))
		        		{fi="invoke_special "+str;break;}
		        	else if(ar[i].contains("){"))
		        		{fi="Function:" +str;break;}
		        	
		        }
				    
//		        System.out.println(Arrays.toString(ar));
		        if(fi=="")
		        {
		        for(String st:ar)
		        {
		        	fi+=st+" ";
		        }
		        }
		        System.out.println(fi);
				    }
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
	        
	    } 
} 
