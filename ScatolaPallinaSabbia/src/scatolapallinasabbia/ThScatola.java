/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scatolapallinasabbia;

/**
 *
 * @author besan
 */
public class ThScatola {

    DatiCondivisi dati;

    int lunghezza;

    int larghezza;

    Sabbia sabbia;

    Pallina pallina;

    public ThScatola(DatiCondivisi dati, int lunghezza, int larghezza) {

        pallina = new Pallina();

        this.dati = dati;

        this.lunghezza = lunghezza;

        this.larghezza = larghezza;

    }

    public void aggiornaVSabbia() {

        sabbia.aggiornaSabbia(3);

    }

    public void aggiornaVPallina() {

        sabbia.aggiornaSabbia(3);

    }

    public void visualizzazionePallina() {

        //swing
    }

    public void visualizzazioneSabbia() {

        //swing
    }

    public void visualizzazioneScatola() {

        visualizzazionePallina();

        visualizzazioneSabbia();

    }

    public int getLunghezza() {

        return lunghezza;

    }

    public int getLarghezza() {

        return larghezza;

    }
}
