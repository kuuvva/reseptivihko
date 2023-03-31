package reseptivihko;

/**
 * Luokka ruuan raaka-aineelle.
 * @author kuuvva
 *
 */
public class RaakaAine {
	
	private String nimi;
	private double kiloHinta;
	
	
	/**
	 * Oletusrakentaja
	 */
	public RaakaAine() {}
	
	
	/**
	 * Asetetaan raaka-aineelle nimi.
	 * @param nimi asetettava nimi
	 * @return olioviite
	 */
	public RaakaAine setNimi(String nimi) {
		this.nimi = nimi;
		return this;
	}
	
	
	/**
	 * Palautetaan raaka-aineen nimi.
	 * @return nimi
	 */
	public String getNimi() {
		return this.nimi;
	}
	
	
	/**
	 * Asetetaan raaka-aineen kilohinta.
	 * @param hinta asetettava hinta
	 * @return olioviite
	 */
	public RaakaAine setKiloHinta(double hinta) {
		this.kiloHinta = hinta;
		return this;
	}
	
	
	/**
	 * Raaka-aineen kilohinta
	 * @return kilohinta 
	 */
	public double getKiloHinta() {
		return this.kiloHinta;
	}
	
	
	/**
	 * Lasketaan raaka-ainemäärän hinta
	 * @param aine laskettava raaka-aine
	 * @param maara raaka-aineen määrä grammoina
	 * @return raaka-ainemäärän hinta
	 */
	public static double laskeHinta(RaakaAine aine, double maara) {
		return aine.getKiloHinta() * maara;
	}
	
	
	/**
	 * Luokan kokeilua
	 * @param args ei käytössä
	 */
	public static void main(String[] args) {
		RaakaAine aine = new RaakaAine();
		aine.setNimi("kuoritut tomaatit");
		aine.setKiloHinta(2.46);
		laskeHinta(aine, 400);
	}
}
