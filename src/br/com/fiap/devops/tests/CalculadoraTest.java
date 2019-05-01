package br.com.fiap.devops.tests;

import org.junit.Test;

import br.com.fiap.devops.Calculadora;
import junit.framework.TestCase;


public class CalculadoraTest extends TestCase {

	@Test
	public void testSomar() {
		Calculadora calculadoraDePrueba = new Calculadora();
		int resultadoEsperado = 4;
		int resultado = calculadoraDePrueba.somar(2, 2);
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void testSubtrair() {
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 100;
		int resultado = calc.subtrair(120, 20);
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void testMultiplicar() {
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 200;
		int resultado = calc.multiplicar(100, 2);
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void testDividir() {
		Calculadora calc = new Calculadora();
		float resultadoEsperado = 100f;
		float resultado = calc.dividir(200, 2);
		assertEquals(resultadoEsperado, resultado);
	}
}