import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcuni articoli
        Articolo articolo1 = new Articolo("A001", "Laptop", 1000.00, 10);
        Articolo articolo2 = new Articolo("A002", "Smartphone", 500.00, 5);
        Articolo articolo3 = new Articolo("A003", "Tablet", 300.00, 3);

        // Creazione di un cliente
        Cliente cliente = new Cliente("C001", "Mario", "Rossi", "mario.rossi@example.com", new Date());

        // Creazione di un carrello per il cliente
        Carrello carrello = new Carrello(cliente);

        // Aggiunta di articoli al carrello
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);
        carrello.aggiungiArticolo(articolo3);

        // Stampa dei dettagli del carrello
        carrello.stampaDettagliCarrello();
    }
}
