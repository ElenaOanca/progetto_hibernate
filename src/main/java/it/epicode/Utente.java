package it.epicode;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
  private String nome;
    private String cognome;
    private Date dataNascita ;

    private Long numeroTessera;

    @ManyToMany
    @JoinTable(name = "prestito", joinColumns = {
            @JoinColumn(name = "utente_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "elementocatalogo_id")
    })
    private List<ElementoCatalogo> elementiPrestati;



    public  Utente( String nome, String cognome, Date dataNascita, Long numeroTessera ){
        this.nome = nome;
        this.cognome =cognome;
        this.dataNascita= dataNascita;
        this.numeroTessera=numeroTessera;

    }

    public Utente(){

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}
