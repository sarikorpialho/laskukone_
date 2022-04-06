import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LaskukoneTest {

	@Test
	void summaTest(){
		
		Laskukone Laskukone = new Laskukone();
		Laskukone.lisaaLuku(5);
		assertEquals(Laskukone.annaTulos(), 5);
	}
	
	@Test
	void vähennyslaskuTest() {
		
		Laskukone Laskukone = new Laskukone();
		Laskukone.vahennaLuku(5);
		assertEquals(Laskukone.annaTulos(), -5);
	}
	
	@Test
	void kertolaskuTest() {
		
		Laskukone Laskukone = new Laskukone();
		Laskukone.kerroLuvulla(3, 10);
		assertEquals(Laskukone.annaTulos(), 30);
	}
	
	@Test
	void potenssiTest() {
		Laskukone Laskukone = new Laskukone();
		Laskukone.korotaPotenssiin(5,3);
		assertEquals(Laskukone.annaTulos(), 125);
	}

	

	
}
