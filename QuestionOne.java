package mypack;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class QuestionOne {

	public static void main(String[] args) {
		 

		
		List<String>l1=new ArrayList<String>();
		l1.add("abc");
		l1.add("apple");
		l1.add("java");
		l1.add("");
		l1.add("bed");
		l1.add("");
		l1.add("ant");
	 
		List<String>lnew=l1.stream().map(l2->String.join(",",l2.toUpperCase())).collect(Collectors.toList());
		System.out.println("Q1.a) Convert string to uppercase and join them with comma(,) :"+ lnew);
	 
		
		long acount = l1.stream() .filter(x -> x.startsWith("a")) .count();
		long emptyStringcount = l1.stream() .filter(x -> x.length()==0) .count();
		
		System.out.println("Q1.b) Create a List with String more than 2 characters and count number of String which\n"
				+ "starts with “a”  : "+ acount + " and count empty string : " + emptyStringcount);

	 
	}

}
