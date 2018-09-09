package tarProg;

import javax.sound.midi.SysexMessage;

public class val {
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("madm");
		StringBuilder sbn=new StringBuilder(sb);
		sbn.reverse();
		System.out.println(sb);
		System.out.println(sbn);
		if(sb.toString().equals(sbn.toString()))
			System.out.println("pall");
		else
			System.out.print("Not");
		
	}

}
