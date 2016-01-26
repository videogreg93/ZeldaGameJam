package com.mygdx.zeldajam.components;

import com.badlogic.gdx.Game;
import com.mygdx.zeldajam.GameObjects.GameObject;

import java.util.ArrayList;

/**
 * Created by Gregory on 1/26/2016.
 */
public abstract class Component {
    public enum ComponentType {
        RENDER,INPUT,POSITION
    }

    ComponentType type;
    GameObject owner;

    public Component(ComponentType type, GameObject object) {
        this.type = type;
        this.owner = object;
    }

    public abstract void update();

    public ComponentType getType() {
        return type;
    }

    public GameObject getOwner() {
        return owner;
    }
}
