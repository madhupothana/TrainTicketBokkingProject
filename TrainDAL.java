package Tickets;

public class TrainDAL {
	String from,to;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public TrainDAL(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
}
