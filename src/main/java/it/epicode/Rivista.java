package it.epicode;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Rivista extends ElementoCatalogo implements Serializable {
    //    private static final long serialVersionUID = 3L;
    public enum Periodicita { SETTIMANALE, MENSILE, SEMESTRALE }
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    // Costruttore completo
    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Rivista() {
        super();
        this.periodicita = Periodicita.MENSILE;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Periodicita getPeriodicita() {
        return periodicita;
    }


    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }




    @Override
    public String toString() {
        return "Rivista{" + "periodicita=" + periodicita + '}';
    }
}
