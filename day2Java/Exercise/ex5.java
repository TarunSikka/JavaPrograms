package day2;

public class ex5 {
	public static void main(String args[])
	{
String str="{{{gyahghgh jksj{}{} snjh {}{}"
		+ "hsbdhsbh"
		+"{}}}}";

int count=str.length()-str.replace("{","").length();
System.out.print(count*2);
	}
}
