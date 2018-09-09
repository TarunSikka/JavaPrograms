class MainPC
{
    public static void main(String args[])
    {
        Producer pd=new Producer();
        Consumer cs=new Consumer();
        
        Student st1=new Student("Rahul",101);
        Student st2=new Student("Raman",102);
        
        pd.addStudent(st1,98);
        System.out.println("Record after adding Rahul");
        cs.getRecord();
        pd.addStudent(st2,82);
        System.out.println("Record after adding Raman");
        cs.getRecord();
        cs.getStudent("Rahul");
    }
}