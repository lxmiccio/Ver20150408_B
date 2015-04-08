package noleggi;

public class Auto extends Veicoli
{
	private int porte;
	
	public Auto(String ID, String descrizione, int veicoliTotali, int porte)
	{
		super(ID, descrizione, veicoliTotali);
		if(porte <= 0)
			throw new IllegalArgumentException("Le porte devono essere positive.");
		this.porte = porte;
	}

	public int getPorte()
	{
		return porte;
	}
}