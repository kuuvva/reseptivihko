package reseptivihko.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import reseptivihko.*;
import static reseptivihko.RaakaAine.laskeHinta;;

class RaakaAineTest {
	
	@Test
	public void setNimiTest() {
		RaakaAine aine = new RaakaAine();
		
		assertEquals(null, aine.getNimi());
		
		aine.setNimi("kuoritut tomaatit");
		assertEquals("kuoritut tomaatit", aine.getNimi());
	}
	
	@Test
	public void setHintaTest() {
		RaakaAine aine = new RaakaAine();
		
		assertEquals(0.0, aine.getKiloHinta());
		
		aine.setKiloHinta(2.46);
		assertEquals(2.46, aine.getKiloHinta());
	}
	
	@Test
	public void laskeHintaTest() {
		RaakaAine aine = new RaakaAine();
		
		assertEquals(0.0, laskeHinta(aine, 0));
		
		aine.setKiloHinta(2.46);
		assertEquals(246, laskeHinta(aine, 100.0));
	}
}
