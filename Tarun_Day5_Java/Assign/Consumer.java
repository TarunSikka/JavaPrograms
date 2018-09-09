import java.util.*;
class Consumer
{
    Producer pd=new Producer();
    public void getRecord()
    {
        if(pd.map.isEmpty())
        {
            System.out.println("No Records");
        }
        else{
            Iterator<Student> itr=pd.map.keySet().iterator();
            while(itr.hasNext())
            {
                Student st=itr.next();
                System.out.println("Name: "+st.getName());
                System.out.println("ID: "+st.getID());
                System.out.println("Marks: "+pd.map.get(st)+"\n");
            }
        }
    }

    public void getStudent(String name)
    {
        if(pd.map.isEmpty())
        {
            System.out.println("No Records");
        }
        else
        {
            Iterator<Student> itr=pd.map.keySet().iterator();
            while(itr.hasNext())
            {
                Student st=itr.next();
                if(st.getName().equals(name))
                {
                    System.out.println("Found");
                    System.out.println("Name: "+st.getName());
                    System.out.println("ID: "+st.getID());
                    System.out.println("Marks: "+pd.map.get(st)+"\n");
                }
            }
        }
    }
}