public class assgn1 {
	public static void main(String[] args) {
		int sp=0,l=0,n=0,oc=0;
		String s="hey how r u 123";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{sp++;				
			}
			else if(Character.isLetter(s.charAt(i)))
			{
				l++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				n++;
			}
			
		}
		oc=s.length()-(sp+l+n);
		System.out.println("Spaces are: "+sp+" Letters are: "+l+" Numbers are: "+n+" Other characters are:"+oc);
	}

}
