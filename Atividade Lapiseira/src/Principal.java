
public class Principal {

		public static void main(String[] args) {
			
			Lapiseira l = new Lapiseira(0.5f);
			//l.show();
			//calibre: 0.5, grafite: null
			Grafite g = new Grafite(0.7f, "2B" ,50);
			l.inserir(g);
			//fail: calibre incompatível
			Grafite g2 = new Grafite(0.5f, "2B", 50);
			l.show();
			//calibre: 0.5, grafite: [0.5:2B:50]
		}
			
}
