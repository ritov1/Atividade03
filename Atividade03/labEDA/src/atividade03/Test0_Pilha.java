package atividade03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Test0_Pilha {

	private static Pilha_IF p ;
	
	@Before //Instanciando a Pilha antes de cada teste
	public void instanciaPilha() throws Exception{
		p = new PilhaComLista();
	}
	
	@Test
	public void testVazia() throws Exception{
		assertTrue(p.isEmpty());
	}
	
	@Test
	public void testPushAndPop() throws Exception{
		p.push(5);
		p.push(10);
		p.push(15);
		assertEquals(15,p.pop());
		assertEquals(10,p.pop());
		assertEquals(5,p.pop());
		assertTrue(p.isEmpty());
	}
	

	@Test
    public void testTop() throws Exception{
		p.push(5);
        p.push(10);
        p.push(15);
        assertEquals(15, p.top());
        p.pop();
        assertEquals(10, p.top());
    }
}