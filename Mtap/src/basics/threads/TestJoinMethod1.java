package basics.threads;
class TestJoinMethod1 extends Thread{  
	public TestJoinMethod1(String string) {
		Thread.currentThread().setName(string);
	}
	public void run(){  
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i +"  --"+Thread.currentThread().getName());  
		}  
	}  
	public static void main(String args[]){  
		TestJoinMethod1 t1=new TestJoinMethod1("first thread");  
		TestJoinMethod1 t2=new TestJoinMethod1("second thread");  
		TestJoinMethod1 t3=new TestJoinMethod1("third thread");  
		t1.start();  
		try{  
			t1.join();  
		}catch(Exception e){System.out.println(e);}  

		t2.start();  
		t3.start();  
	}  
}  