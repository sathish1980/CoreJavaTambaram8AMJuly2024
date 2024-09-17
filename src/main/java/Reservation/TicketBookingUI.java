package Reservation;

public class TicketBookingUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBookingFuncationality tBF= new TicketBookingFuncationality();
		TicketBookingThread t = new TicketBookingThread(tBF,"sathish", 2);
		TicketBookingThread t1 = new TicketBookingThread(tBF,"kumar", 2);

		t.start();
		t.setName("sathish- Thread");
		t1.start();
		t1.setName("Kumar- Thread");
	}

}
