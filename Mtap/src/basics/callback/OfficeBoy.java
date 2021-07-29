package basics.callback;


public class OfficeBoy {
	
	 public void doWork(BrotherCallBack callback) {
		 	try {
				System.out.println("doing work");
				Thread.sleep(10000);
		        callback.call();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	    }

	

}
