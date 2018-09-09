package day3;

public class pairs {

	public static void main(String[] args) {
		String str="{{{sahghdajh}}}{}";
		int ptr=-1;
		char arr[]=new char[1000];
		boolean flag=true;
		for(char c:str.toCharArray())
		{
			if(c=='{')
				arr[++ptr]=c;
			else if(c=='}')
			{	if(ptr!=-1&&arr[ptr]=='{')
				{	arr[ptr]='\u0000';
					ptr--;
				}
				else
					{flag=false;break;}
			}
				
		}
		if(ptr!=-1||flag==false)
			System.out.println("Mismatch");
		else
			System.out.println("match");

	}

}
