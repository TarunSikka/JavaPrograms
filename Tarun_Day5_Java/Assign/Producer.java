import java.util.*;
class Producer
{
    static Map<Student,Integer> map=new HashMap<>();
    public static void addStudent(Student st,Integer marks)
    {
        map.put(st,marks);
    }
    
}