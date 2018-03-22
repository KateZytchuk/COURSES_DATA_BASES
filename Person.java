package view;

public class Person 
{
	private int id;
	private String fname;
	private String lname;
	private int age;
	
    public Person(int id, String lname, String fname, int age)
    {
    	 this.id = id;
         this.fname = fname;
         this.lname = lname;
         this.age = age;
    }
    public Person()
    {
    	
    }
    public int getId() {
        return id;
    }
 
    public String getFname() {
        return fname;
    }
 
    public int getAge() {
        return age;
    }
 
    public String getLname() {
        return lname;
    }
    
}
