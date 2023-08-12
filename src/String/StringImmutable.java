package String;

public class StringImmutable {
    public static void main(String[] args) {
		String str = "Anjali"; //Anjali
		String str1 = "Sachin"; //Sachin
		String str2 = "Sachin"; //Anjali
		String str3 = "Sachin"; //Anjali
		
      str.concat("Tendulkar"); //new object is created with modification Anjali Singh
		 
		  System.out.println(str);
		  System.out.println(str1);
		  System.out.println(str2);
		  System.out.println(str3);
	}
}
