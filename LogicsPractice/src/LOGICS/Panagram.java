package LOGICS;

import java.util.LinkedHashSet;
import java.util.Set;

public class Panagram {
public static void main(String[] args) {
	String str= "the quick brown fox jumps over thge lazy dog";
	str=str.replaceAll(" ","").toLowerCase();
	Set<Character> s1= new LinkedHashSet<Character>();
	for(char c:str.toCharArray()) {
		s1.add(c);
	}
	if(s1.size()==26) {
		System.out.println("panagram");
	}
	else 
		System.out.println("not a panagram ");
}
}
