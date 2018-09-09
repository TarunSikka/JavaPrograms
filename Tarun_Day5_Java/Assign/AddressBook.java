import java.util.*;
class AddressBook
{
    private String introduction;
    Contact cont;
    List<Contact> ab=new ArrayList<>();
    AddressBook(){
        introduction="NTI address book(Confidential)";
    }

    public void setIntro(String intro)
    {
        this.introduction=intro;
    }

    public String getIntro()
    {
        return introduction;
    }

    public void createContact(String name,String email)
    {
        cont= new Contact(name,email);
    }

    public void addContact()
    {
        ab.add(cont);
    }
    
    public void printAddressBook()
    {
        System.out.println(introduction);
        //if(cont!=null)
        if(!ab.isEmpty())
        {
            for(Contact contact:ab)
            {
                System.out.println("Name: "+contact.getName());
                System.out.println("Email: "+contact.getEmail());
                System.out.println("Address: "+contact.address.getName()+" "+contact.address.getPostCode()+" "+contact.address.getCity()+" "+contact.address.getCountry());
                System.out.println("Phone: "+contact.phone.getIAC()+"-"+contact.phone.getPrefix()+"-"+contact.phone.getNumber());
            }
        }
        else
             System.out.println("Addres Book is empty");
    }

    public static void main()
    {
        AddressBook ab=new AddressBook();
        ab.createContact("Ravi","raviTiwari@gmail.com");
        ab.cont.addAddress("Logix",201305,"Noida","India");
        ab.cont.addAlternateAddress("Paras",201305,"Noida","India");
        ab.cont.addPhone(91,0,9915456);
        ab.cont.addAlternatePhone(413,0,4612561);
        ab.addContact();
        ab.printAddressBook();
    }
}