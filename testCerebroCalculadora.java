package testCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import calculadora.CerebroCalculadoraED;
import calculadora.Operaciones;
class testCerebroCalculadora {
	  CerebroCalculadoraED calculadora = new CerebroCalculadoraED();

	@Test
	  public void testOperarSuma() {
		    System.out.println("Introduce 3 y 4");

		  calculadora.numero1=3;
			 calculadora.numero2=4;
	    calculadora.operarSuma(Operaciones.SUMAR);
	   
	    int esperado=7;
	    assertEquals(esperado, calculadora.resultado); 

}
	@Test
	public void testOperarResta() {
		System.out.println("Introduce 2 y 3");
		calculadora.numero1=2;
		calculadora.numero2=3;
		int esperado=-1;
		calculadora.operarResta(Operaciones.RESTAR);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testOperarMulti() {
		System.out.println("Introduce 7 y 4");
		calculadora.numero1=7;
		calculadora.numero2=4;
		int esperado=28;
		calculadora.operarMultiplica(Operaciones.MULTIPLICAR);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testOperarDivi() {
		System.out.println("Introduce 12 y 2");
		calculadora.numero1=12;
		calculadora.numero2=2;
		int esperado=6;
		calculadora.operarDivide(Operaciones.DIVIDIR);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testOperarSumaRES() {
		System.out.println("Introduce 3 y 4");
	    calculadora.operarSuma(Operaciones.SUMAR);
		System.out.println("Introduce 12");
		calculadora.numero2=12;
		int esperado=19;
		calculadora.operarSumaRes(Operaciones.SUMAR_RES);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testOperarRestaRES() {
		System.out.println("Introduce 2 y 3");
		calculadora.operarResta(Operaciones.RESTAR);
		System.out.println("Introduce 7");
		calculadora.numero2=7;
		int esperado=-8;
		calculadora.operarRestaRes(Operaciones.RESTAR_RES);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testOperarMultiRES() {
		System.out.println("Introduce 7 y 4");
		calculadora.operarMultiplica(Operaciones.MULTIPLICAR);
		System.out.println("Introduce 2");
		calculadora.numero2=2;
		int esperado=56;
		calculadora.operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testOperarDiviRES() {
		System.out.println("Introduce 12 y 2");
		calculadora.operarDivide(Operaciones.DIVIDIR);
		System.out.println("Introduce 3");
		calculadora.numero2=3;
		int esperado=2;
		calculadora.operarDivideRes(Operaciones.DIVIDIR_RES);
	assertEquals(esperado, calculadora.resultado);
	}
	@Test
	public void testMostrarResultado() {
		System.out.println("Introduce 12 y 2");
		calculadora.operarDivide(Operaciones.DIVIDIR);	
		calculadora.mostrarResultadoActual(Operaciones.RESULTADO);
		int esperado=6;
		assertEquals(esperado, calculadora.resultado);
}
	@Test
	
	public void testUltimosResultados() {
		System.out.println("Introduce 3 y 4");
	    calculadora.operarSuma(Operaciones.SUMAR);
	    System.out.println("Introduce 3 y 4");
	    calculadora.operarSuma(Operaciones.SUMAR);
	    System.out.println("Introduce 3 y 4");
	    calculadora.operarSuma(Operaciones.SUMAR);
	    System.out.println("Introduce 3 y 4");
	    calculadora.operarSuma(Operaciones.SUMAR);
	    System.out.println("Introduce 3 y 4");
	    calculadora.operarSuma(Operaciones.SUMAR);
		calculadora.operarHistorial();
		
	}
	@Test
	
	public void testNumerosAleatorios() {
	calculadora.numeroAleatorio(Operaciones.RANDOM);
		assertTrue(calculadora.resultado>0&&calculadora.resultado<101);
		
	}
	@Test
	public void testFormato() {
		System.out.println("Introduce 1 y 2");
		calculadora.operarSuma(Operaciones.SUMAR);
		int esperado=3;
		assertEquals(esperado, calculadora.resultado, 0.0001f);
	}



}
