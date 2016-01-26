package com.mygdx.zeldajam.components;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.zeldajam.GameObjects.GameObject;

/**
 * Created by Gregory on 1/26/2016.
 */
public class RenderComponent extends Component {
    private Sprite sprite;
    private PositionComponent positionComponent;

    public RenderComponent(Texture text, GameObject owner) {
        super(ComponentType.RENDER, owner);
        sprite = new Sprite(text);
        positionComponent = new PositionComponent(owner);
    }

    public RenderComponent(Texture text, GameObject owner, float x, float y, float velocityX, float velocityY) {
        super(ComponentType.RENDER, owner);
        sprite = new Sprite(text);
        positionComponent = new PositionComponent(owner, x, y, velocityX, velocityY);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public PositionComponent getPositionComponent() {
        return positionComponent;
    }

    public float getX() {
        return  positionComponent.getX();
    }

    public float getY() {
        return positionComponent.getY();
    }

    @Override
    public void update() {

    }
}
