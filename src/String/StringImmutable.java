package String;

public class StringImmutable {
    public static void main(String[] args) {
		String str = "Anjali"; //Anjali
		String str1 = "Sachin"; //Anjali
		String str2 = "Sachin"; //Anjali
		String str3 = "Sachin"; //Anjali
		
      str.concat("Tendulkar"); //new object is created with modification Anjali Singh
		 
		  System.out.println(str);
	}
}
