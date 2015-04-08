package noleggi;

public class Bilico extends Veicoli
{
	private double portata;
	
	public Bilico(String ID, String descrizione, int veicoliTotali, double portata)
	{
		super(ID, descrizione, veicoliTotali);
		if(portata <= 0)
			throw new IllegalArgumentException("La portata deve essere positiva.");
		this.portata = portata;
	}

	public double getPortata()
	{
		return portata;
	}
}