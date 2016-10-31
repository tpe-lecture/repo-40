package tpe.oo.abstrakt;

/**
 * Ein Dreieck.
 */
public class Dreieck extends Figur {

    /** Grundseite des Dreiecks. */
    private double grundseite;

    /** Höhe. */
    private double hoehe;

    /**
     * Erzeugt ein neues Dreieck.
     *
     * @param grundseite Grundseite.
     * @param hoehe Höhe.
     */
    public Dreieck(double grundseite, double hoehe) {
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    /**
     * Berechnet die Fläche.
     *
     * @return die Fläche.
     */
    @Override
    public double flaeche() {
        return grundseite * hoehe / 2;
    }
}
