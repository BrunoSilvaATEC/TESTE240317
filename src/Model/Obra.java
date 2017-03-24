package Model;

public class Obra {

	private String artista;
	private String obra;
	private String categoria;
	private String tipo;
	private int data;
	
	public Obra(String artista, String obra, String categoria, String tipo, int data) {
		super();
		this.artista = artista;
		this.obra = obra;
		this.categoria = categoria;
		this.tipo = tipo;
		this.data = data;
	}
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getObra() {
		return obra;
	}
	public void setObra(String obra) {
		this.obra = obra;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

}
