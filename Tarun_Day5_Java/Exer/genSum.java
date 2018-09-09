package day5;

public class genSum {
	public <T> String sum(T obj1,T obj2)
	{
		if((obj1 instanceof Number)&&(obj2 instanceof Number))
			return Double.toString(Double.parseDouble(obj1.toString())+Double.parseDouble(obj2.toString()));
		else if(obj1 instanceof String||obj2 instanceof String)
			return obj1.toString()+""+obj2.toString();
		else 
			return null;
	}

	public static void main(String[] args) {
		genSum obj= new genSum();
		System.out.println(obj.sum(1,2));
		
		
	}

}
