package it.epicode;

import jakarta.persistence.*;

@Entity

public class Libro extends ElementoCatalogo{

    private String autore;
    private String genere;

//    private static final long serialVersionUID = 1L;

    public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public Libro() {
        super();
        this.autore = "";
        this.genere = "";
    }



    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
    @Override
    public String toString() {
        return "Libro{" + "autore=" + autore + ", genere=" + genere + '}';
    }
}
