
public class FileRequest extends Packet{
	private String Path;
	private String Filename;
	private String Size;
	private String Id;
	
	public FileRequest(String path, String filename, String size, String id){
		this.Path = path;
		this.Filename = filename;
		this.Size = size;
		this.Id = id; // Uniuqe ID to identify the request/file. See MessageDisgest()
	}

}
