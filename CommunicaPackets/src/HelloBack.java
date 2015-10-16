import java.net.InetAddress;

public class HelloBack extends Packet{
	private String Nickname;
	private InetAddress Ip;
	
	public HelloBack(String nickname, InetAddress ip){
		this.Ip = ip;
		this.Nickname = nickname;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public InetAddress getIp() {
		return Ip;
	}
	public void setIp(InetAddress ip) {
		Ip = ip;
	}	
}
