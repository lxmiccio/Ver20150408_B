package noleggi;

public class Noleggio
{
	private String ID;
	private int veicoli; //Veicoli noleggiati
	private Cliente cliente;
	
	public Noleggio(String ID, int veicoli, Cliente cliente)
	{
		if(ID.length() == 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere diversa da 0.");
		this.ID = new String(ID);
		if(veicoli <= 0)
			throw new IllegalArgumentException("I veicoli devono essere positivi.");
		this.veicoli = veicoli;
		this.cliente = cliente;
	}

	public String getID()
	{
		return ID;
	}

	public int getVeicoli()
	{
		return veicoli;
	}

	public Cliente getC()
	{
		return cliente;
	}
	
	@Override public String toString()
	{
		return "Noleggio [ID=" + ID + ", veicoli=" + veicoli + ", cliente="
				+ cliente + "]";
	}
}