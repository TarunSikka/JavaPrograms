class Student
{
    private String name;
    private int id;
    Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setID(int id)
    {
        this.id=id;
    }
    public int getID()
    {
        return id;
    }
    
}