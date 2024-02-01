package it.epicode;

import java.util.Date;

public class MainBiblioteca {
    public static void main(String[] args) {

    Archivio archivio = new Archivio();


        ElementoCatalogo libro1 = new Libro("123456789", "Il signore degli anelli", 1954, 1000, "Tolkien", "Fantasy");
        ElementoCatalogo libro2 = new Libro("987654321", "Harry Potter e la pietra filosofale", 1997, 336, "J.K. Rowling", "Fantasy");
        ElementoCatalogo libro3 = new Libro("111222333", "1984", 1949, 328, "George Orwell", "Distopia");
        ElementoCatalogo libro4 = new Libro("444555666", "Cronache di Narnia: Il leone, la strega e l'armadio", 1950, 208, "C.S. Lewis", "Fantasy");
        ElementoCatalogo libro5 = new Libro("777888999", "Il grande Gatsby", 1925, 180, "F. Scott Fitzgerald", "Romanzo");
        ElementoCatalogo libro6 = new Libro("000111222", "Moby Dick", 1851, 720, "Herman Melville", "Avventura");
        ElementoCatalogo libro7 = new Libro("333444555", "Anna Karenina", 1877, 864, "Lev Tolstoj", "Romanzo");
        ElementoCatalogo libro8 = new Libro("666777888", "Orgoglio e pregiudizio", 1813, 432, "Jane Austen", "Romanzo");
        ElementoCatalogo libro9 = new Libro("999000111", "Cime tempestose", 1847, 416, "Emily Brontë", "Romanzo");
        ElementoCatalogo libro10 = new Libro("123123123", "Il giovane Holden", 1951, 277, "J.D. Salinger", "Romanzo");


        Rivista rivista1 = new Rivista("111111", "National Geographic", 2022, 50, Rivista.Periodicita.SETTIMANALE);
        Rivista rivista2 = new Rivista("222222", "Time Magazine", 2022, 40, Rivista.Periodicita.MENSILE);
        Rivista rivista3 = new Rivista("333333", "Scientific American", 2022, 60, Rivista.Periodicita.SEMESTRALE);
        Rivista rivista4 = new Rivista("444444", "The New Yorker", 2021, 48, Rivista.Periodicita.SETTIMANALE);
        Rivista rivista5 = new Rivista("555555", "Wired", 2021, 36, Rivista.Periodicita.MENSILE);
        Rivista rivista6 = new Rivista("666666", "Nature", 2021, 54, Rivista.Periodicita.SEMESTRALE);
        Rivista rivista7 = new Rivista("777777", "The Economist", 2020, 44, Rivista.Periodicita.SETTIMANALE);
        Rivista rivista8 = new Rivista("888888", "Harper's Magazine", 2020, 52, Rivista.Periodicita.MENSILE);
        Rivista rivista9 = new Rivista("999999", "Popular Science", 2020, 38, Rivista.Periodicita.SEMESTRALE);
        Rivista rivista10 = new Rivista("101010", "Newsweek", 2019, 42, Rivista.Periodicita.SETTIMANALE);



        archivio.aggiungiElementoCatalogo(libro1);
        archivio.aggiungiElementoCatalogo(libro2);
        archivio.aggiungiElementoCatalogo(libro3);
        archivio.aggiungiElementoCatalogo(libro4);
archivio.aggiungiElementoCatalogo(libro5);
archivio.aggiungiElementoCatalogo(libro6);
archivio.aggiungiElementoCatalogo(libro7);
archivio.aggiungiElementoCatalogo(libro8);
archivio.aggiungiElementoCatalogo(libro9);
archivio.aggiungiElementoCatalogo(libro10);
archivio.aggiungiElementoCatalogo(rivista1);
archivio.aggiungiElementoCatalogo(rivista2);
archivio.aggiungiElementoCatalogo(rivista3);
archivio.aggiungiElementoCatalogo(rivista4);
archivio.aggiungiElementoCatalogo(rivista5);
archivio.aggiungiElementoCatalogo(rivista6);
archivio.aggiungiElementoCatalogo(rivista7);
archivio.aggiungiElementoCatalogo(rivista8);
archivio.aggiungiElementoCatalogo(rivista9);
archivio.aggiungiElementoCatalogo(rivista10);
    System.out.println("Aggiungo elementi al catalogo");
    archivio.ricercaPerTitoloParziale("%");
    System.out.println("Ricerca per titolo parziale");

    archivio.ricercaPerAutore("Tolkien");
    System.out.println("Ricerca per autore");

    archivio.ricercaPerAnnoPubblicazione(1954);
    System.out.println("Ricerca per anno di pubblicazione");

    archivio.rimuoviElementoCatalogo("123456789");
    System.out.println("Rimuovo elemento dal catalogo");

    archivio.ricercaPerTitoloParziale("%");
    System.out.println("Ricerca per titolo parziale");

    //ricerca per numero tessera utente
    archivio.ricercaPerNumeroTessera(13L);
    System.out.println("Ricerca per numero tessera utente");
    Utente utente1 = new Utente("ciro","esposito",new Date(), 13L);
    archivio.aggiungiUtente(utente1);
    Prestito prestito = new Prestito(utente1, libro2, new Date());

    archivio.creaPrestito(prestito);

    archivio.ricercaPerNumeroTessera(13L);






        archivio.closeEntityManager();









    }
}
