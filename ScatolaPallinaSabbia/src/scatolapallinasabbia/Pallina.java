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
public class Pallina {

    int raggio;

    float posX, posY;

    double velX, velY;

    int dirX, dirY;

    int w, h;

    public Pallina() {

        raggio = 30;

        velX = 4.8;

        velY = 2.2;

        if ((int) (Math.random() * 200) % 2 == 0) {

            dirX = 1;

        } else {

            dirX = -1;

        }

        if ((int) (Math.random() * 200) % 2 == 0) {

            dirY = 1;

        } else {

            dirY = -1;

        }

        posX = 0;

        posY = 0;

        w = 0;

        h = 0;

    }

    public void move() {

        // aggiorna la posizione
        posX = posX + (float) (velX * dirX);

        posY = posY + (float) (velY * dirY);

        if (posX > w - raggio || posX < raggio) {

            dirX *= -1;

        }

        if (posY > h - raggio || posY < raggio) {

            dirY *= -1;

        }

    }

    public void incVel() {

        velX += 0.2;

        velY += 0.2;

    }

    public void decVel() {

        velX -= 0.2;

        if (velX < 0) {

            velX = 0;

        }

        velY -= 0.2;

        if (velY < 0) {

            velY = 0;

        }

    }

    void setScreen(int width, int height) {

        w = width;

        h = height;

        posX = w / 2 + (int) (Math.random() * 50);;

        posY = h / 2;

    }

    public float getXpos() {

        return posX;

    }

    public int getRaggio() {

        return raggio;

    }

    public float getYpos() {

        return posY;

    }
}
