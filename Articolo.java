public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private int numeroPezziDisponibili;

    // Costruttore
    public Articolo(String codice, String descrizione, double prezzo, int numeroPezziDisponibili) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    // Metodi getter
    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    // Metodi setter
    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    @Override
    public String toString() {
        return "Codice: " + codice + ", Descrizione: " + descrizione + ", Prezzo: " + prezzo + ", Disponibili: " + numeroPezziDisponibili;
    }
}

