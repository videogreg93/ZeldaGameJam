package com.mygdx.zeldajam.Services;

import com.mygdx.zeldajam.GameObjects.GameObject;
import com.mygdx.zeldajam.components.Component;
import com.mygdx.zeldajam.components.InputComponent;

import java.util.ArrayList;

/**
 * Created by Gregory on 1/26/2016.
 */
public class InputService extends Service{
    public InputService() {
        super();
    }

    @Override
    public void update(ArrayList<GameObject> gameObjects) {
        for (GameObject object : gameObjects) {
            for (Component component : object.getComponents()) {
                if (component.getType() == Component.ComponentType.INPUT)
                    ((InputComponent) component).update();
            }
        }
    }
}
