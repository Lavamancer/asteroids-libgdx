package com.jalbarracin;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Laser implements Entity {

    Texture texture;
    int x;
    int y;


    public Laser(int x) {
        texture = new Texture("laser.png");
        this.x = x - texture.getWidth() / 2;
    }

    @Override
    public void update() {
        y += 10;
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.draw(texture, x, y);
    }



}