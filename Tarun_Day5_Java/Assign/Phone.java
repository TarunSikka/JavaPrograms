class Phone
{
    private int internationalAreaCode;
    private int prefix;
    private int number;
    Phone(int iac,int prefix,int number)
    {
        this.internationalAreaCode=iac;
        this.prefix=prefix;
        this.number=number;
    }
    public void setIAC(int iac)
    {
        this.internationalAreaCode=iac;
    }

    public int getIAC()
    {
        return internationalAreaCode;
    }

    public void setPrefix(int prefix)
    {
        this.prefix=prefix;
    }

    public int getPrefix()
    {
        return prefix;
    }

    public void setNumber(int number)
    {
        this.number=number;
    }

    public int getNumber()
    {
        return number;
    }

   /* public void addNumber(int iac,int prefix,int number)
    {
        this.internationalAreaCode=iac;
        this.prefix=prefix;
        this.number=number;
    }*/
}