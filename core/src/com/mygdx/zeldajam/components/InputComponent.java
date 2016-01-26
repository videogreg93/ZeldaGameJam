package com.mygdx.zeldajam.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.zeldajam.GameObjects.GameObject;

/**
 * Created by Gregory on 1/26/2016.
 */
public abstract class InputComponent extends Component implements InputProcessor {

    PositionComponent positionComponent;

    public InputComponent(GameObject owner) {
        super(ComponentType.INPUT, owner);
        InputMultiplexer multiplexer = new InputMultiplexer();
        if (Gdx.input.getInputProcessor() != null)
            multiplexer.addProcessor(Gdx.input.getInputProcessor());
        multiplexer.addProcessor(this);
        Gdx.input.setInputProcessor(multiplexer);
        for (Component component : owner.getComponents()) {
            if (component.type == ComponentType.RENDER)
                positionComponent = ((RenderComponent) component).getPositionComponent();
        }
    }



    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {

        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
