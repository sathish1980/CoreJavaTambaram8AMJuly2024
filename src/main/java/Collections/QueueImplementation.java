package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
	
	public void queuedata()
	{
		//Queue<Integer> Q = new LinkedList<>();
		PriorityQueue <Integer> Q=  new PriorityQueue<>();
		// FIFO
		System.out.println(Q);
		Q.add(3);
		Q.add(3);
		Q.add(5);
		Q.add(9);
		Q.add(6);
		//System.out.println(Q);
		Q.remove();
		 
		System.out.println(Q);
		System.out.println(Q.peek());
		System.out.println(Q.poll());
		System.out.println(Q.size());
		Q.add(10);
		System.out.println(Q);
		
		ArrayList<String> Hdfc = new ArrayList<>();
		Hdfc.add("Sathish");
		Hdfc.add("11052000");
		Hdfc.add("9159211184");
		Hdfc.add("10000");
		ArrayList<String> SBI = new ArrayList<>();
		SBI.add("Sathish_SBI");
		SBI.add("11052001");
		SBI.add("9159211185");
		SBI.add("1000");
		ArrayList<String> ICICI = new ArrayList<>();
		ICICI.add("Sathish_ICICI");
		ICICI.add("11052002");
		ICICI.add("9159211186");
		ICICI.add("5000");
		
		LinkedHashSet<String> bankAccounts = new LinkedHashSet<>();
		
		bankAccounts.addAll(Hdfc);
		bankAccounts.addAll(SBI);
		ICICI.set(3, "7000");
		bankAccounts.addAll(ICICI);
		System.out.println(bankAccounts);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementation Q = new QueueImplementation();
		Q.queuedata();
	}

}
