package designpatterns.observer;
public class Main {

	public static void main(String[] args) {

		PostOffice postoffice = new PostOffice();
		Person chris = new Person("Chris");
		Person john = new Person("John");
		Passport passport = new Passport("John", "Dundee", "You've got a secret passport");
		chris.checkMail(null);
		postoffice.register(chris);
		postoffice.register(john);
		
		postoffice.addMail(passport);
	}
}