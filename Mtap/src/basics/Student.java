package basics;
public class Student {

    String name; //partition --- instance variable
    int age;
    boolean isMale;
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public Student(String paramName, int paramAge, boolean isMale) {//ashish=constructor= name = class name
        this.name = paramName;
        this.age = paramAge;
        this.isMale = isMale;
    }

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
    
    
}