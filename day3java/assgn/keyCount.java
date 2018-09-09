public class keyCount {
	 
	
	public static void main(String[] args) {
		String ar[]={ "abstract", "assert", "boolean",
	            "break", "byte", "case", "catch", "char", "class", "const",
	            "continue", "default", "do", "double", "else", "extends", "false",
	            "final", "finally", "float", "for", "goto", "if", "implements",
	            "import", "instanceof", "int", "interface", "long", "native",
	            "new", "null", "package", "private", "protected", "public",
	            "return", "short", "static", "strictfp", "super", "switch",
	            "synchronized", "this", "throw", "throws", "transient", "true",
	            "try", "void", "volatile", "while" };
		int count=0;
		for(int i=0;i<args.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{	
					if(args[i].equals(ar[j]))
						count++;
			}
		}
		System.out.println("Count "+count);
	}

}
