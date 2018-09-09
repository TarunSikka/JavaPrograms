class Address
{
    private String name;
    private Integer postalCode;
    private String city;
    private String country;
    public Address(String place,Integer postalCode,String city,String country){
        this.name=place;
        this.postalCode=postalCode;
        this.city=city;
        this.country=country;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setPostCode(Integer postalCode)
    {
        this.postalCode=postalCode;
    }
    public Integer getPostCode()
    {
        return postalCode;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public String getCity()
    {
        return city;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getCountry()
    {
        return country;
    }
    /*public void addAddress(String place,Integer postalCode,String city,String country)
    {
        this.name=name;
        this.postalCode=postalCode;
        this.city=city;
        this.country=country;
        */
    public void reset()
    {
        this.name="";
        this.postalCode=0;
        this.city="";
        this.country="";
    }
}