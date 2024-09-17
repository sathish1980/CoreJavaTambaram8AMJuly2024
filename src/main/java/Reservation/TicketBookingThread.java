package Reservation;

public class TicketBookingThread  extends Thread{

	//TicketBookingFuncationality t = new TicketBookingFuncationality();

	private TicketBookingFuncationality TBF;
	String userName;
	int totalTickets;

	public TicketBookingThread(TicketBookingFuncationality TBF,String userName,int totalTickets)
	{
		this.TBF =TBF;
		this.userName=userName;
		this.totalTickets=totalTickets;

	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		TBF.GenerateTicket(userName,totalTickets);
	}
}
