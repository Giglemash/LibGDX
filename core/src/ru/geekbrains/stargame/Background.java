package ru.geekbrains.stargame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Background {
    Texture texture;
    Vector2 position; // position.x position.y
    float speed; //


    public Background(){
        texture = new Texture("1162129.jpg");

    }
    public void render (SpriteBatch batch){
        batch.draw(texture, 0, 0, 1280, 720); //????????
    }
    //void draw (Texture texture, float x, float y)????


    public void update() {
        position.x -= speed;
        if (position.x < -20) {
            position.x = 1280;
            position.y = MathUtils.random(0, 720);
            speed = MathUtils.random(0.5f, 2.5f);
        }
    }
}



