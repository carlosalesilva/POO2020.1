
public class Lapiseira {

	private float calibre;
	private Grafite grafite;
	
	
	public Lapiseira(float calibre) {
		this.calibre = calibre;
	}
	public void inserir(Grafite grafite) {
		if(grafite.getCalibre() == calibre) {
			grafite.setCalibre(grafite.getCalibre());
			grafite.setDureza(grafite.getDureza());

		}else {
			System.out.println("Calibre incompatível!");
		}
	}
	public void remover() {
		
		}
	
	public void escrever() {
		
	}
	public void show() {
		if(grafite != null) {
		System.out.println("Calibre: " + grafite.getCalibre() + ", Grafite: [" + grafite.getCalibre() + ":" + grafite.getDureza() + ":" + grafite.getTamanho() + "]");
		}else 
			System.out.println("Calibre: " + getCalibre() + ", Grafite: null");
		}
	public float getCalibre() {
		return calibre;
	}
	public Grafite getGrafite() {
		return grafite;
	}
	public void setCalibre(float calibre) {
		this.calibre = calibre;
	}
	public void setGrafite(Grafite grafite) {
		this.grafite = grafite;
	}

	
}
