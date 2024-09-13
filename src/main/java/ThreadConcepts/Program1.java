package ThreadConcepts;

public class Program1 extends Thread{
	
	public void run()
	{
		run5times();
		
	}
	
	public void run5times()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run10times()
	{
		for(int i=10;i<15;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 P = new Program1();
		P.start(); // start the Thread 
		System.out.println(P.getName());
		Program1 P1 = new Program1();
		P1.start();
		System.out.println(P1.getName());
	}

}
