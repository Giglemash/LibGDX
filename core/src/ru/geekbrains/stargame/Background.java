package ru.geekbrains.stargame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Background {
    Texture texture;


    public Background(){
        texture = new Texture("1162129.jpg");

    }
    public void render (SpriteBatch batch){
        batch.draw(texture, 0, 0, 724,724); //????????
    }
    //void draw (Texture texture, float x, float y)????

    public void update (){
    }
}
