package com.mygdx.zeldajam.Services;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.zeldajam.GameObjects.GameObject;
import com.mygdx.zeldajam.components.Component;
import com.mygdx.zeldajam.components.RenderComponent;

import java.util.ArrayList;

/**
 * Created by Gregory on 1/26/2016.
 */
public class RenderService extends Service {
    SpriteBatch batch = new SpriteBatch();

    @Override
    public void update(ArrayList<GameObject> gameObjects) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        for (GameObject object : gameObjects) {
            for (Component component : object.getComponents()) {
                if (component.getType() == Component.ComponentType.RENDER)
                    batch.draw(((RenderComponent) component).getSprite(), ((RenderComponent) component).getX(), ((RenderComponent) component).getY());
            }
        }
        batch.end();
    }
}
