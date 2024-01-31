package it.epicode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String cognome;

    private int dataNascita;
    private String numeroDiTessera;






    public Utente(String nome, String cognome, int dataNascita, String numeroDiTessera) {
        this.nome = nome;
        this.cognome = cognome;

    }

    public Utente() {
        this.nome = "";
        this.cognome = "";
        this.dataNascita = 0;
        this.numeroDiTessera = "";


    }



    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(int dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(String numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }



    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +

                ", dataNascita=" + dataNascita +
                ", numeroDiTessera='" + numeroDiTessera + '\'' +
                '}';
    }
}
