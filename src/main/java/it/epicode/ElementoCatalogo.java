package it.epicode;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

abstract class ElementoCatalogo implements java.io.Serializable{
    //    private static final long serialVersionUID = 4L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;

    @ManyToMany(mappedBy = "elementiPrestati")
    private List<Utente> utenti;

    public ElementoCatalogo(String isbn, String titolo, int annoPubblicazione, int numeroPagine) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public ElementoCatalogo() {
        this.isbn = "";
        this.titolo = "";
        this.annoPubblicazione = 0;
        this.numeroPagine = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getIsbn() {
//        return isbn;
//    }

    public void getIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public String toString(){
        return "ElementoCatalogo{" + "isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + '}';
    };





}
