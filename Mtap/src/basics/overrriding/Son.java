package basics.overrriding;

public class Son extends Father{
	
	
	@Override
	public void eat() {
		//super.eat();
		System.out.println("eating with forks");
	}

}
