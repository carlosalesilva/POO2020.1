import java.util.Scanner;

public class Moto {
	
	Passageiro passageiro = new Passageiro();
	
	private int potencia = 1;
	private Passageiro pessoa;
	private int tempo;
	private float combustivel;
	private float maxcombustivel = 10;
	
	public Moto(int potencia,int tempo,float combustivel,float maxcombustivel,Passageiro pessoa,boolean pass) {
		this.potencia = potencia;
		this.pessoa = pessoa;
		this.tempo = tempo;
		this.combustivel = combustivel;
		this.maxcombustivel = maxcombustivel;
	
	}
	public Moto() {
		
	}

	public int getPotencia() {
		return potencia;
	}

	public Passageiro getPessoa() {
		return pessoa;
	}

	public int getTempo() {
		return tempo;
	}

	public float getCombustivel() {
		return combustivel;
	}

	public float getMaxcombustivel() {
		return maxcombustivel;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setPessoa(Passageiro pessoa) {
		this.pessoa = pessoa;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}

	public void setMaxcombustivel(float maxcombustivel) {
		this.maxcombustivel = maxcombustivel;
	}
	
	public void subir() {
		if(passageiro.getIdade() > 10){
			System.out.println("Você está muito velho para andar de motoca...");
		}
		else if(passageiro.getNome() != null){
			System.out.println("Motoca ocupada...");
		}
		else { 
			System.out.println("Informe seu nome:\n");
			Scanner ler = new Scanner(System.in);
			passageiro.setNome(ler.nextLine());
			System.out.println("Informe sua idade:\n");
			passageiro.setIdade(ler.nextInt());
			if(passageiro.getIdade() == 0) {
				System.out.println("Idade inválida...");
				passageiro.setNome(null);
			}
			else System.out.println("Passageiro embarcado...");
		}
	}
	
	public void descer() {
		if(passageiro.getNome() != null || passageiro.getIdade() != 0){
			passageiro.setNome(null);
			passageiro.setIdade(0);
			System.out.println("Passageiro desceu...");
		}
		else System.out.println("Moto vazia...");
	}
	public void comprartempo(int tempo) {
		setTempo(tempo);
	}
	public void dirigirtempo(int drive){
		if(passageiro.getIdade() >= 10) {
			System.out.println("Passageiro muito grande para andar na moto...");
			}
		else if(getTempo() <= 0) {
			System.out.println("Compre tempo...");
		}
		else if(getCombustivel() <= 0) {
			System.out.println("Moto sem combustível...");
		}
		else {
		int litro = drive/2;
		setCombustivel(getCombustivel()-litro);
		setTempo(getTempo()-drive);
		}
			}
	public void abastecer(int fuel){
		setCombustivel(getCombustivel() + fuel);
		
	}
	public void buzinar() {
		if(passageiro.getNome() != null){
		int i = 0;
		System.out.print("P");
		while(i < getPotencia()) {
			System.out.print("e");
			i++;
		}
		System.out.print("m");
		}
		else System.out.println("Não tem passageiro na motoca...");
	}	
	
}
