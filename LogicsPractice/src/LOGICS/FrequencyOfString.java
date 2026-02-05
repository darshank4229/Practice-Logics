package LOGICS;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfString {
public static void main(String[] args) {
	String str= "darshan";
	Map<Character, Integer> m1= new LinkedHashMap<Character, Integer>();
	for(char c:str.toCharArray()) {
		m1.put(c,m1.getOrDefault(c,0)+1);
	}
	for(Map.Entry<Character,Integer> e1: m1.entrySet()) {
		if(e1.getValue()>1)
		System.out.println(e1.getKey()+" --> "+e1.getValue());
	}
}
}
