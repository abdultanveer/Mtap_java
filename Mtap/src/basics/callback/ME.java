package basics.callback;

public class ME {
	public static void main(String[] args) {
		System.out.println("my office boy is going");
		OfficeBoy officeBoy = new OfficeBoy();
		MobilePhone mobilePhone = new MyBrother(); //this mobile phone is connected to my brother
		officeBoy.doWork(mobilePhone);
		//officeBoy.doAnotherWork();
	}

}
