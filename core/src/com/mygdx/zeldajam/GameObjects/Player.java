package com.mygdx.zeldajam.GameObjects;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.zeldajam.components.InputComponent;
import com.mygdx.zeldajam.components.PlayerInputComponent;
import com.mygdx.zeldajam.components.RenderComponent;
import com.mygdx.zeldajam.components.TestInputComponent;

/**
 * Created by Gregory on 1/26/2016.
 */
public class Player extends GameObject {
    public Player() {
        super("Hero");

        // List of components
        components.add(new RenderComponent(new Texture("test.png"), this,0,0,300,300));
        components.add(new PlayerInputComponent(this));
    }
}
