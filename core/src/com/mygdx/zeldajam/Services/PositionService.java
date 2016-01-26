package com.mygdx.zeldajam.Services;

import com.mygdx.zeldajam.GameObjects.GameObject;
import com.mygdx.zeldajam.components.Component;
import com.mygdx.zeldajam.components.RenderComponent;

import java.util.ArrayList;

/**
 * Created by Gregory on 1/26/2016.
 */
public class PositionService extends Service {

    public PositionService() {
        super();
    }



    @Override
    public void update(ArrayList<GameObject> gameObjects) {
        for (GameObject object : gameObjects) {
            for (Component component : object.getComponents()) {
                if (component.getType() == Component.ComponentType.RENDER)
                    ((RenderComponent) component).getPositionComponent().update();
            }
        }
    }




}
