package classes;

public class Cone {
	private float r;
	private float z;
	private double g;
	private double areaTotal;
	private double areaFundo;
	private double areaLateral;
	
	public void setR(float r) {
		this.r = r;
	}
	
	public Float getR() {
		return r;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public Float getZ() {
		return z;
	}
	
	public double calculaG() {
		this.g = Math.sqrt(((this.r * this.r) + (this.z * this.z)));
		
		return g;
	}
	
	public double calculaAreaTotal() {
		this.areaTotal = 3.14 * this.r * (this.r + this.g);
		
		return areaTotal;
	}
	
	public double calculaAreaFundo() {
		this.areaFundo = 3.14 * (this.r * this.r);
		
		return areaFundo;
	}
	
	public double calculaAreaLateral() {
		this.areaLateral = 3.14 * this.g * this.r;
		
		return areaLateral;
	}
}
