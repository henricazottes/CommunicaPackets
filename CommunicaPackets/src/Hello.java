import java.net.InetAddress;


public class Hello extends Packet {
	private String Nickname;
	private InetAddress Ip;
	
	public Hello(String nickname, InetAddress ip){
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
