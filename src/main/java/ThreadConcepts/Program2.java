package ThreadConcepts;

public class Program2 implements Runnable {
	
	int a=10;
	
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
		Program2 P = new Program2();
		Thread T = new Thread(P);
		T.setName("Sathish");
		T.start(); // start the Thread 
		System.out.println(T.getPriority());
		System.out.println(T.getName());
		Thread T1 = new Thread(P);
		T1.setDaemon(true);
		System.out.println(T1.isDaemon());
		System.out.println(T1.isAlive());
		T1.start();
		T1.setPriority(9);
		System.out.println("T1 Priority ---->"+T1.getPriority());
		System.out.println(T1.getName());
		System.out.println("Thread 1 status---->"+T1.isAlive());
	}

}
