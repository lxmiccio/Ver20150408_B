package noleggi;

public class Cliente
{
	private String nome;
	private String cognome;
	private String email;
	
	public Cliente(String nome, String cognome, String email)
	{
		if(nome.length() <= 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere maggiore di 0.");
		this.nome = new String(nome);
		if(cognome.length() <= 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere maggiore di 0.");
		this.cognome = new String(cognome);
		if(email.length() <= 0)
			throw new IllegalArgumentException("La lunghezza della stringa deve essere maggiore di 0.");
		this.email = new String(email);
	}

	public String getNome()
	{
		return nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public String getEmail()
	{
		return email;
	}

	@Override public String toString()
	{
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}
}