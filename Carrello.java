import java.util.ArrayList;

public class Carrello {
    private Cliente cliente;
    private ArrayList<Articolo> articoli;
    private double totaleCosto;

    // Costruttore
    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totaleCosto = 0.0;
    }

    // Metodo per aggiungere un articolo al carrello
    public void aggiungiArticolo(Articolo articolo) {
        if (articolo.getNumeroPezziDisponibili() > 0) {
            articoli.add(articolo);
            totaleCosto += articolo.getPrezzo();
            articolo.setNumeroPezziDisponibili(articolo.getNumeroPezziDisponibili() - 1);
        } else {
            System.out.println("Articolo " + articolo.getCodice() + " non disponibile.");
        }
    }

    // Metodo per calcolare il totale del carrello
    public double calcolaTotale() {
        totaleCosto = 0.0;
        for (Articolo articolo : articoli) {
            totaleCosto += articolo.getPrezzo();
        }
        return totaleCosto;
    }

    // Metodo per stampare i dettagli del carrello
    public void stampaDettagliCarrello() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : articoli) {
            System.out.println(articolo);
        }
        System.out.println("Totale costo: " + calcolaTotale() + " euro");
    }
}

