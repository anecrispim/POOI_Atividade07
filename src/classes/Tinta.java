package classes;

public class Tinta {
	private int tipo;
	private double litros;
	private double latas;
	private double preco;
	
	public Tinta () {
		
	}
	
	public Tinta(double areaTotal) {
		this.litros = areaTotal * 3.45;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public double getLitros() {
		return litros;
	}
	
	public double calculaLatas() {
		this.latas = Math.ceil((this.litros / 18));
		
		return latas;
	}
	
	public double calculaPreco() {
		if (this.tipo == 1) {
			this.preco = this.latas * 238.90;
		} else if (this.tipo == 2) {
			this.preco = this.latas * 467.98;
		} else if (this.tipo == 3) {
			this.preco = this.latas * 758.34;
		} else {
			System.out.println("Tipo inválido");
		}
		
		return preco;
	}
}
