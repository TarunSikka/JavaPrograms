package day5;

import java.util.HashMap;
import java.util.Map;

public class imphashMap {
	public static void main(String[] args) {
		Map<String,String> fruit=new HashMap<String,String>();
		fruit.put("APPLE", "RED");
		fruit.put("PEAR", "YELLOW");
		fruit.put("PLUM","PURPLE");
		fruit.put("CHERRY","RED");
		for(String key: fruit.keySet()){
			System.out.println(key+": "+fruit.get(key));
		}
	}

}
