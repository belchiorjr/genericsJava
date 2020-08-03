package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
	
	/*	CaixaNumero<String> caixaA = new CaixaNumero<>();
		caixaA.guardar("Teste");*/
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(123456789);
		Integer numInt = caixaB.abrir();
		System.out.println(numInt);
		
		CaixaNumero<Double> caixaD = new CaixaNumero<>();
		caixaD.guardar(1.21212122121);
		Double numDouble = caixaD.abrir();
		System.out.println(numDouble);
		
	}
}
