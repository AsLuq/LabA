/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristoratori;

/**
 *
 * @author Andrea Basilico
 */
public class Ristorante {
    // attributes 
    String nomeRistorante, indirizzo, urlWeb, tipologia, numTelefonico;
    
    //constructor
    public Ristorante(String nomeRistorante, String indirizzo, String urlWeb, String tipologia,String numTelefonico) {
        this.nomeRistorante = nomeRistorante;
        this.indirizzo = indirizzo;
        this.urlWeb = urlWeb;
        this.tipologia = tipologia;
        this.numTelefonico = numTelefonico;
    }

    //get&set
    //<editor-fold>
    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getUrlWeb() {
        return urlWeb;
    }

    public void setUrlWeb(String urlWeb) {
        this.urlWeb = urlWeb;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }
    //</editor-fold>
}
