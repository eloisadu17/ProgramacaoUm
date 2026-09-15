package fundamentos_programacao_lista2;

public class A3 {

	public static void main(String[] args) {
		double distancia = 420;
        double litros = 35;

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Litros necessários para 100 km: " + litrosPara100Km + " L");
	}

}
