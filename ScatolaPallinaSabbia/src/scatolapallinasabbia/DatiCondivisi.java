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
public class DatiCondivisi {

    private Pallina[] palline;

    private int running;

    public DatiCondivisi(int numBalls, int width, int height) {

        palline = new Pallina[numBalls];

        for (int i = 0; i < palline.length; i++) {

            palline[i] = new Pallina();

        }

        running = numBalls;

    }

    public Pallina getPalline(int i) {

        return palline[i];

    }

    public void decRunning() {

        running--;

    }

    public boolean isRunning() {

        return running > 0;

    }

    public int numPalline() {

        return palline.length;

    }

    public void incVel() {

        for (int i = 0; i < palline.length; i++) {

            palline[i].incVel();

        }

    }

    public void decVel() {

        for (int i = 0; i < palline.length; i++) {

            palline[i].decVel();

        }

    }

    public void setScreen(int width, int height) {

        for (int i = 0; i < palline.length; i++) {

            palline[i].setScreen(width, height);

        }

    }
}
