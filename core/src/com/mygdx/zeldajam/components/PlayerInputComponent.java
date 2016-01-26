package com.mygdx.zeldajam.components;

import com.badlogic.gdx.Input;
import com.mygdx.zeldajam.GameObjects.GameObject;

/**
 * Created by Gregory on 1/26/2016.
 */
public class PlayerInputComponent extends InputComponent {
    public PlayerInputComponent(GameObject owner) {
        super(owner);
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.LEFT) {
            try {
                positionComponent.setLeftMove(true);
            } catch (Exception e) {

            }
        }
        if (keycode == Input.Keys.RIGHT) {
            try {
                positionComponent.setRightMove(true);
            } catch (Exception e) {

            }
        }

        if (keycode == Input.Keys.UP) {
            try {
                positionComponent.setUpMove(true);
            } catch (Exception e) {

            }
        }
        if (keycode == Input.Keys.DOWN) {
            try {
                positionComponent.setDowntMove(true);
            } catch (Exception e) {

            }
        }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.LEFT) {
            try {
                positionComponent.setLeftMove(false);
            } catch (Exception e) {

            }
        }
        if (keycode == Input.Keys.RIGHT) {
            try {
                positionComponent.setRightMove(false);
            } catch (Exception e) {

            }
        }

        if (keycode == Input.Keys.UP) {
            try {
                positionComponent.setUpMove(false);
            } catch (Exception e) {

            }
        }
        if (keycode == Input.Keys.DOWN) {
            try {
                positionComponent.setDowntMove(false);
            } catch (Exception e) {

            }
        }
        return false;
    }

    @Override
    public void update() {

    }
}
