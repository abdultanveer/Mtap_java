package basics;
public class TestStudent {

    public static void main(String[] args) {
        Student abdul = new Student("ansari",123,true);  //new will create a box in ram
        Student ansari;
		/*
		 * abdul.name = "tanveer"; abdul.age = 123;
		 */
        
        abdul.setName("tanveer");
        
        System.out.println(abdul.name);
    }
}