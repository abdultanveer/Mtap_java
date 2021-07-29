package basics.callback;

public class MyBrother implements BrotherCallBack {

	@Override
	public void call() {
		System.out.println("office boy is done with his work, im giving him another task");
		doAnotherWork();
	}

	public void doAnotherWork() {
		System.out.println("doing another work");
	}
}
