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
public class Sabbia {

    int x;

    int vx;

    public void sabbia(int x, int vx) {

        this.x = x;

        this.vx = vx;

    }

    public void sabbia() {

        this.x = 0;

        this.vx = 0;

    }

    public void aggiornaSabbia(int vx) {

        x += vx;

    }

    public int getX() {

        return x;

    }

    public int getVx() {

        return vx;

    }

    public void setX(int x) {

        this.x = x;

    }

    public void setVx(int vx) {

        this.vx = vx;

    }
}
