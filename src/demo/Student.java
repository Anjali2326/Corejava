package demo;

public class Student {
	    int id;
	    String name;
	    String place;
	
	     void display()
	    {
		
		  System.out.println(id+" "+name+" "+place);
	    }
	
	      public static void main(String[] args) {
		
		     Student d= new Student();
		     Student d1= new Student();
		
		     d.display();
		     d1.display();
        }
	
	}
