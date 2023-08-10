package String;

public class CompareTo {  
	public static void main(String[] args) {  //this is worst
		
		 String s="Anjali";
		 String s1="Anjali";
		 String s2="hello";
		 String s3="flag";
		 System.out.println(s.compareTo(s1));
		 System.out.println(s2.compareTo(s3));
		 System.out.println(s.compareTo(s3));
		   
		 //empty string
		 String s4="Hello";
		 String s5="";
		 String s6="ma";
		 System.out.println(s4.compareTo(s5));
		 System.out.println(s5.compareTo(s6));
		 
		 }

}
