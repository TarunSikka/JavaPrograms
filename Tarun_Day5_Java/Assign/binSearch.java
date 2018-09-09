import java.util.Scanner;
class binSearch
{
    int ar[];
    int min=0,max;
    int s=0,num=0;
    public void input()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        s=sc.nextInt();
        ar=new int[s];
        max=ar.length-1;
        System.out.println("Enter "+s+" Elements ");
        for(int x=0;x<s;x++)
        {
            ar[x]=sc.nextInt();
        }
        System.out.println("Enter number to search ");
        num=sc.nextInt();
    }

    public void display()
    {
        for(int i=0;i<s;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        if(Bsearch(num)==-1)
            System.out.println("Not Found");
        else
            System.out.println("Found");
    }

    public int Bsearch(int n)
    {
        if(min<=max)
        {
            int mid=(min+max)/2;
            if(ar[mid]==n)
            {
                return mid;
            }
            else if(ar[mid]<n)
            {
                min=mid+1;
                return Bsearch(n);
            }
            else
            {
                max=mid-1;
                return Bsearch(n);
            }
        } 
        else
            return -1;
    }

    public static void main(String args[])
    {
        binSearch ob=new binSearch();
        ob.input();
        ob.display();

    }
}

     