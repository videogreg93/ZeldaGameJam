package com.mygdx.zeldajam.components;

import com.mygdx.zeldajam.GameObjects.GameObject;

/**
 * Created by Gregory on 1/26/2016.
 */
public class TestInputComponent extends InputComponent {
    public TestInputComponent(GameObject owner) {
        super(owner);
        positionComponent.moveHorizontal(true);
    }

    @Override
    public void update() {

    }
}
