import java.io.*;
import java.util.*;
class lineCount
{
    public static void main(String args[])
    {
        /*String str="class check"
        +"{"
        +"public void fun(){"
        +"int a=2;"
        +"for(){}"
        +"}"
        +"}";*/
        File file = 
            new File("checks.txt"); 

        try{
            Scanner sc = new Scanner(file); 
            while (sc.hasNextLine()) 
            {
                String str=sc.nextLine();
                if(str.contains("){"))
                {
                    System.out.println(str);
                    int ctr=1;
                    int ptr=0;
                    char arr[]=new char[1000];
                    arr[0]='{';
                    while(ptr!=-1)
                    {
                        String sent=sc.nextLine();
                        for(char c:sent.toCharArray())
                        {
                            if(c=='{')
                                arr[++ptr]=c;
                            else if(c=='}')
                            {		
                                arr[ptr]='\u0000';
                                ptr--;
                            }
                        }
                        System.out.println(ctr+""+sent);
                        ctr++;
                    }

                }
                else
                {
                    System.out.println(str);
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No file exists");
        }
    }
}