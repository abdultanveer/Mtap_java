package basics.callback;

public class MyBrother implements MobilePhone {

	@Override
	public void onSuccessButtonOne() {
		System.out.println("office boy is done with his work, im giving him another task");
		doAnotherWork();
	}

	public void doAnotherWork() {
		System.out.println("doing another work");
	}
}
