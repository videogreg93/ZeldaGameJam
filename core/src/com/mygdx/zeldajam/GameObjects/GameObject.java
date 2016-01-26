package com.mygdx.zeldajam.GameObjects;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.zeldajam.components.Component;

import java.util.ArrayList;

/**
 * Created by Gregory on 1/26/2016.
 */
public class GameObject extends Actor {
    ArrayList<Component> components;
    String tag;
    public GameObject(String name) {
        tag = name;
        components = new ArrayList<Component>();
    }

    public ArrayList<Component> getComponents() {
        return components;
    }
}
