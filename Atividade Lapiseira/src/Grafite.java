
public class Grafite {

	private float calibre;
	private String dureza;
	private int tamanho;
	
	public Grafite(float calibre, String dureza, int tamanho) {
		this.calibre = calibre;
		this.dureza = dureza;
		this.tamanho = tamanho;
	}

	public float getCalibre() {
		return calibre;
	}

	public String getDureza() {
		return dureza;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}

	public void setDureza(String dureza) {
		this.dureza = dureza;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
}
