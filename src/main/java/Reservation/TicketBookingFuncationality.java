package Reservation;

public class TicketBookingFuncationality {

	private int Availableticket =3;
	public synchronized void GenerateTicket(String user,int totalTicketRequested)
	{
		if((totalTicketRequested>0 &&totalTicketRequested<=Availableticket ))
		{
			System.out.println("Hi " + user +" the requested "+totalTicketRequested+" tickets are booked sucessfully");
			Availableticket = Availableticket-totalTicketRequested;
		}
		else
		{
			System.out.println("Sorry No available tickets !!!");
		}
	}
	
	/*public static void main(String[] args)
	{
		TicketBookingFuncationality T = new TicketBookingFuncationality();
		
		T.GenerateTicket("A", 1);
		T.GenerateTicket("A", 1);
		T.GenerateTicket("A", 1);
	}*/
}
