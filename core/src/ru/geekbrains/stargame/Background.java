package ru.geekbrains.stargame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Background {

    Texture texture;

    public Background() {
        texture = new Texture("908869.png");
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, 0, 0);
    }

    public void update() {
    }
}





