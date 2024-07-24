import java.util.Date;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscrizione;

    // Costruttore
    public Cliente(String codiceCliente, String nome, String cognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    // Metodi getter
    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    @Override
    public String toString() {
        return "Codice Cliente: " + codiceCliente + ", Nome: " + nome + ", Cognome: " + cognome + ", Email: " + email + ", Data Iscrizione: " + dataIscrizione;
    }
}
