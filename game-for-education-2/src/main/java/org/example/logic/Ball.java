package org.example.logic;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball extends Entity {
    private int lives;

    public Ball(int x, int y, String url) {
        super(x, y, url);
        this.lives = 10;
    }



    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }


    public boolean isCollided (Rectangle otherObject) {
        return getRectangle().intersects(otherObject);
    }

}
