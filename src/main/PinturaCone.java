package main;

import java.util.Scanner;
import classes.Cone;
import classes.Tinta;

public class PinturaCone {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Cone cone = new Cone();
		
		System.out.print("Informe o valor de r: ");
		cone.setR(entrada.nextFloat());

		System.out.print("Informe o valor de z: ");
		cone.setZ(entrada.nextFloat());
		
		double g = cone.calculaG();
		Tinta tinta = new Tinta(cone.calculaAreaTotal());
		
		System.out.println("Tipo 1 – R$ 238,90\n" + "Tipo 2 – R$ 467,98\n" + "Tipo 3 – R$ 758,34\n");
		
		System.out.print("Informe o tipo de tinta : ");
		tinta.setTipo(entrada.nextInt());
		
		System.out.println("\nRaio = " + cone.getR());
		System.out.println("Altura = " + cone.getZ());
		System.out.println("Nível = " + tinta.getTipo());
		System.out.println("-------------");
		System.out.println("Geratriz = " + g);
		System.out.println("-------------");
		System.out.println("Area do Fundo = " + cone.calculaAreaFundo());
		System.out.println("Area Lateral Cone = " + cone.calculaAreaLateral());
		System.out.println("Area Total = " + cone.calculaAreaTotal());
		System.out.println("-------------");
		System.out.println("Litros = " + tinta.getLitros());
		System.out.println("Latas = " + tinta.calculaLatas());
		System.out.println("-------------");
		System.out.println("Preco Total = " + tinta.calculaPreco());
		
		entrada.close();
	}

}
