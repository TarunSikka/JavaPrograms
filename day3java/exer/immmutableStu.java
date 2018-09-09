package day3;

public final class immmutableStu {

	private final int id;
	private final String name;
	private final age ag;
	public immmutableStu(int id,String name,age ages)
	{
		this.name=name;
		this.id=id;
		age cloneAge=new age();
		cloneAge.setDay(ages.getDay());
		cloneAge.setMonth(ages.getMonth());
		cloneAge.setYear(ages.getYear());
		this.ag=cloneAge;
	}
	public int getId()
	{
		return id;
	}
	public  String getName()
	{
		return name;
	}
	public age getAge()
	{
		age cloneAge=new age();
		cloneAge.setDay(this.ag.getDay());
		cloneAge.setMonth(this.ag.getMonth());
		cloneAge.setYear(this.ag.getYear());
		return cloneAge;
	}

}
