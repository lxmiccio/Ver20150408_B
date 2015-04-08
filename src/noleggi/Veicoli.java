package noleggi;

import java.util.Vector;

public class Veicoli
{
	private String ID;
	private String descrizione;
	private int veicoliTotali;
	private Vector<Noleggio> noleggi;
	
	public Veicoli(String ID, String descrizione, int veicoliTotali)
	{
		if(ID.length() == 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere diversa da 0.");
		this.ID = new String(ID);
		if(descrizione.length() == 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere diversa da 0.");
		this.descrizione = new String(descrizione);
		if(veicoliTotali <= 0)
			throw new IllegalArgumentException("I veicoli devono essere positivi.");
		this.veicoliTotali = veicoliTotali;
		this.noleggi = new Vector<Noleggio>(veicoliTotali, 0);
	}

	public String getID()
	{
		return ID;
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public int getVeicoliTotali()
	{
		return veicoliTotali;
	}
	
	public int getVeicoliDisponibili()
	{
		int counter, veicoliDisponibili = noleggi.size();
		for(counter = 0; counter < noleggi.size(); counter++)
			veicoliDisponibili -= noleggi.get(counter).getVeicoli();
		return veicoliDisponibili;
	}
	
	public void addNoleggio(Noleggio n)
	{
		if(getVeicoliDisponibili() <= 0)
			throw new IllegalArgumentException("Posti non disponibili.");
		noleggi.addElement(n);
	}

	public Vector<Noleggio> getNoleggi()
	{
		return noleggi;
	}
}