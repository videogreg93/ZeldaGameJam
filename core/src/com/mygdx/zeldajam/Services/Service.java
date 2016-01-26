package com.mygdx.zeldajam.Services;

import com.mygdx.zeldajam.GameObjects.GameObject;

import java.util.ArrayList;

/**
 * Created by Gregory on 1/26/2016.
 */
public abstract class Service {
    public Service() {

    }

    public abstract void update(ArrayList<GameObject> gameObjects);
}
