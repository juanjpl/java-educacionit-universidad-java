package ar.com.educacionit.universidad.interfacesII;

public class FS extends Storage {

	private String path;
	
	public FS(String contenido, String path) {
		super(contenido);
		
		this.setPath(path);
	}
	
	private void setPath(String path) {
		this.path = path;
	}
	public String getPath() {
		return path;
	}
}
