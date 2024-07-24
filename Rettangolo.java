public class Rettangolo {
    // Attributi privati per altezza e larghezza
    private double altezza;
    private double larghezza;

    // Costruttore per inizializzare altezza e larghezza
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodi getter per altezza e larghezza
    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    // Metodi setter per altezza e larghezza
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo per stampare area e perimetro di un rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Rettangolo:");
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }

    // Metodo per stampare area e perimetro di due rettangoli e la loro somma
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo Rettangolo:");
        stampaRettangolo(r1);
        System.out.println("Secondo Rettangolo:");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    // Main per testare i metodi
    public static void main(String[] args) {
        // Creazione di due rettangoli
        Rettangolo r1 = new Rettangolo(4.0, 5.0);
        Rettangolo r2 = new Rettangolo(7.0, 3.0);

        // Stampa dei dettagli dei due rettangoli
        stampaRettangolo(r1);
        stampaRettangolo(r2);

        // Stampa dei dettagli combinati dei due rettangoli
        stampaDueRettangoli(r1, r2);
    }
}
