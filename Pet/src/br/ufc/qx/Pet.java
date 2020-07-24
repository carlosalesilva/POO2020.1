package br.ufc.qx;

public class Pet {

	private int energia;
	private int fome;
	private int limpo;
	private int diamantes;
	private int idade;
	private boolean vivo;
	private int energiamax = 3;
	private int limpomax = 3;
	
	public Pet(){
		
	}
	
	public Pet(int energia) {
		this.energia = this.energiamax;
		this.fome = this.limpomax;
		this.limpo = 0;
		this.diamantes = 0;
		this.idade = 0;
		this.vivo = true;
		
	}
	

	public int getEnergiamax() {
		return energiamax;
	}

	public int getLimpomax() {
		return limpomax;
	}

	public void setEnergiamax(int energiamax) {
		this.energiamax = energiamax;
	}

	public void setLimpomax(int limpomax) {
		this.limpomax = limpomax;
	}

	public int getEnergia() {
		return energia;
	}

	public int getFome() {
		return fome;
	}

	public int getLimpo() {
		return limpo;
	}

	public int getDiamantes() {
		return diamantes;
	}

	public int getIdade() {
		return idade;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void setFome(int fome) {
		this.fome = fome;
	}

	public void setLimpo(int limpo) {
		this.limpo = limpo;
	}

	public void setDiamantes(int diamantes) {
		this.diamantes = diamantes;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	public boolean brincar() {
		System.out.println("Brincando...");
		
		if(this.energia <= 0 || this.limpo <= 0){
			this.vivo = false;
			System.out.println("Seu pet morreu sem energia!");
			System.out.println("Seu pet morreu sujo!");
		}
		else{
		this.diamantes += 1;
		this.fome += 1;
		this.energia -= 1;
		this.limpo -= 1;
		this.idade += 1;
		this.vivo = true;
		}
		
		return vivo;
		
	}
	
	public boolean banho() {
		System.out.println("Tomando banho...");
		
		if(this.energia <= 0 || this.limpo <= 0){
			this.vivo = false;
			System.out.println("Seu pet morreu sem energia!");
			System.out.println("Seu pet morreu sujo!");
		}
		else if(this.limpo >= this.limpomax) {
			this.limpo = this.limpomax;
		}
		else {
		this.limpo += 1;
		this.fome += 1;
		this.energia -= 1;
		this.idade += 1;
		this.vivo = true;
		}
		return vivo;
	}
	
	public boolean comer() {
		System.out.println("Comendo...");
		
		if(this.energia <= 0 || this.limpo <= 0){
			this.vivo = false;
			System.out.println("Seu pet morreu sem energia!");
			System.out.println("Seu pet morreu sujo!");
		}
		else if(this.energia >= this.energiamax) {
			this.energia = this.energiamax;
		}
		else if(this.fome < 0) {
			this.fome = 0;
		}
		else {
		this.energia += 1;
		this.fome -= 1;
		this.limpo -= 1;
		this.idade += 1;
		}
		return vivo;
	}
	
	public boolean dormir() {
		System.out.println("Dormindo...");
		
		if(this.energia <= 0 || this.limpo <= 0){
			this.vivo = false;
			System.out.println("Seu pet morreu sem energia!");
			System.out.println("Seu pet morreu sujo!");
		}
		else if(this.energia >= this.energiamax) {
			this.energia = this.energiamax;
		}
		else {
		this.energia += 1;
		this.idade += 1;
		this.vivo = true;
		}
		return vivo;
	}



}

