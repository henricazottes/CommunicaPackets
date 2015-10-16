
public class FileResponse extends Packet{
	private Boolean Response;
	private String Id;
	
	public FileResponse(Boolean response, String id){
		this.Response = response;
		this.Id = id;
	}

	public Boolean getResponse() {
		return Response;
	}

	public void setResponse(Boolean response) {
		Response = response;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
}
