package MovieApp;

public class Movie {
	
	private  int     movie_id;
	private String Customer_name;
	private int no_of_tickets;
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public int getNo_of_tickets() {
		return no_of_tickets;
	}
	public void setNo_of_tickets(int no_of_tickets) {
		this.no_of_tickets = no_of_tickets;
	}
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", Customer_name=" + Customer_name + ", no_of_tickets=" + no_of_tickets
				+ "]";
	}
	public Movie(int movie_id, String customer_name, int no_of_tickets) {
		super();
		this.movie_id = movie_id;
		Customer_name = customer_name;
		this.no_of_tickets = no_of_tickets;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
