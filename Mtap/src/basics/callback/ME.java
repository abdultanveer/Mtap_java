package basics.callback;

public class ME {
	public static void main(String[] args) {
		System.out.println("my office boy is going");
		OfficeBoy officeBoy = new OfficeBoy();
		BrotherCallBack back = new MyBrother();
		officeBoy.doWork(back);
		//officeBoy.doAnotherWork();
	}

}
