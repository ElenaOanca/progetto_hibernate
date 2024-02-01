package it.epicode;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Calendar;


@Entity
class Prestito {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;


    @ManyToOne
    private Utente utente;


    @ManyToOne
    private ElementoCatalogo elementocatalogo;

    @Temporal(TemporalType.DATE)
    private Date dataInizioPrestito;

    @Temporal(TemporalType.DATE)
    private Date dataRestituzionePrevista;

    @Temporal(TemporalType.DATE)
    private Date dataRestituzioneEffettiva;

    public Prestito(Utente utente, ElementoCatalogo elementocatalogo, Date dataInizioPrestito) {
        this.utente = utente;
        this.elementocatalogo = elementocatalogo;
        this.dataInizioPrestito = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(dataInizioPrestito);
        cal.add(Calendar.DATE, 30);

        this.dataRestituzionePrevista = cal.getTime();
    }


    public ElementoCatalogo getElementoCatalogo() {
        return elementocatalogo;
    }

    public Utente getUtente() {
        return utente;
    }

    public Date getDataInizioPrestito() {
        return dataInizioPrestito;
    }



    public Date getDataRestituzionePrevista() {
        Date dataRestituzionePrevista = new Date();
        dataRestituzionePrevista.setTime(dataInizioPrestito.getTime() + (30*24 * 60 * 60 * 1000));
        return dataRestituzionePrevista;
    }


    public Date getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setElementoCatalogo(ElementoCatalogo elementoCatalogo) {
        this.elementocatalogo = elementoCatalogo;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setDataInizioPrestito(Date dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}