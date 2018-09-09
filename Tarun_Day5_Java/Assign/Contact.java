class Contact
{
    private String name;
    private String email;
    Address address, altAddress;
    Phone phone, altPhone;
    
    public Contact(String name,String email)
    {
        this.name=name;
        this.email=email;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void addAddress(String place,Integer postalCode,String city,String country)
    {
        address=new Address(place, postalCode, city, country);
    }
    public void addAlternateAddress(String place,Integer postalCode,String city,String country)
    {
        altAddress=new Address(place, postalCode, city, country);
    }
    public void addPhone(int iac,int prefix,int number)
    {
        phone=new Phone(iac, prefix, number);
    }
    public void addAlternatePhone(int iac,int prefix,int number)
    {
        altPhone=new Phone(iac, prefix, number);
    }
}
