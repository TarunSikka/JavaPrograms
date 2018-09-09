package day5;

public class Comparaexa implements Comparable<Comparaexa>{
	private  final String firstName,LastName;
	public Comparaexa(String f,String l)
	{
		if(f==null||l==null)
			throw new NullPointerException();
		this.firstName=f;
		this.LastName=l;
	}
	public String firstName(){
		return firstName;
	}
	public String lastName(){
		return LastName;
	}
	public boolean equals(Object o)
	{
		if(!(o instanceof Comparaexa))
			return false;
		Comparaexa n=(Comparaexa)o;
		return n.firstName.equals(firstName)&&n.LastName.equals(LastName);
	}
	public int hashCode(){
		return 31*firstName.hashCode()+LastName.hashCode();
	}
	public int compareTo(Comparaexa n)
	{
		int lastCmp=LastName.compareTo(n.LastName);
		return (lastCmp!=0 ? lastCmp: firstName.compareTo(n.firstName));
	}
	}
	

