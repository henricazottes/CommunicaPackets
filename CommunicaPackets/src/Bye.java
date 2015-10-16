
public class Bye extends Packet{
	private String Nickname;
	
	public Bye(String nickname){
		this.Nickname = nickname;
	}

	public String getNickname() {
		return Nickname;
	}

	public void setNickname(String nickname) {
		Nickname = nickname;
	}
}
