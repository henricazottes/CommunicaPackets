import java.sql.Date;

public class Message extends Packet{
	private Date Time;
	private String From;
	private String Payload;
	
	public Message(Date time, String from, String payload){
		this.Time = time;
		this.From = from;
		this.Payload = payload;
	}

	public Date getTime() {
		return Time;
	}

	public void setTime(Date time) {
		Time = time;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getPayload() {
		return Payload;
	}

	public void setPayload(String payload) {
		Payload = payload;
	}
}
