import java.util.LinkedList;

class Chiamata {
    private String numeroChiamato;
    private int durata;

    // Costruttore per inizializzare una chiamata
    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    // Metodi getter per numero chiamato e durata
    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    // Metodo per stampare i dettagli di una chiamata
    @Override
    public String toString() {
        return "Numero chiamato: " + numeroChiamato + ", Durata: " + durata + " minuti";
    }
}

class SIM {
    private String numeroTelefono;
    private double credito;
    private LinkedList<Chiamata> ultimeChiamate;

    // Costruttore per inizializzare una SIM con il numero di telefono
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new LinkedList<>();
    }

    // Metodo per ottenere il numero di telefono
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    // Metodo per ottenere il credito
    public double getCredito() {
        return credito;
    }

    // Metodo per aggiungere credito
    public void aggiungiCredito(double importo) {
        if (importo > 0) {
            this.credito += importo;
        } else {
            System.out.println("Importo non valido.");
        }
    }

    // Metodo per aggiungere una chiamata alla lista delle ultime chiamate
    public void aggiungiChiamata(String numeroChiamato, int durata) {
        if (ultimeChiamate.size() == 5) {
            ultimeChiamate.removeFirst();
        }
        ultimeChiamate.add(new Chiamata(numeroChiamato, durata));
    }

    // Metodo per stampare i dati della SIM
    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime 5 chiamate effettuate:");
        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata chiamata : ultimeChiamate) {
                System.out.println(chiamata);
            }
        }
    }

    // Main per testare la classe SIM
    public static void main(String[] args) {
        // Creazione di una SIM
        SIM sim = new SIM("1234567890");

        // Aggiunta di credito
        sim.aggiungiCredito(10.0);

        // Aggiunta di chiamate
        sim.aggiungiChiamata("0987654321", 5);
        sim.aggiungiChiamata("1231231234", 10);
        sim.aggiungiChiamata("3213213214", 3);
        sim.aggiungiChiamata("5675675678", 7);
        sim.aggiungiChiamata("7897897890", 2);
        sim.aggiungiChiamata("4564564567", 4);

        // Stampa dei dati della SIM
        sim.stampaDatiSIM();
    }
}
