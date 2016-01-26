package com.mygdx.zeldajam.components;

import com.badlogic.gdx.Gdx;
import com.mygdx.zeldajam.GameObjects.GameObject;

/**
 * Created by Gregory on 1/26/2016.
 */
public class PositionComponent extends Component {
    float x,y;
    float velocityX,velocityY;
    float DEFAULTVELOCITYX = 0;
    float DEFAULTVELOCITYY = 0;
    boolean leftMove = false;
    boolean rightMove = false;
    boolean upMove = false;
    boolean downMove = false;

    public PositionComponent(GameObject owner) {
        super(ComponentType.POSITION, owner);
        x = 0;
        y = 0;
        velocityX = 0;
        velocityY = 0;
    }

    public PositionComponent(GameObject owner, float x, float y, float defVelocityX, float defVelocityY) {
        super(ComponentType.POSITION, owner);
        this.x = x;
        this.y = y;
        velocityX = 0;
        velocityY = 0;
        DEFAULTVELOCITYX = defVelocityX;
        DEFAULTVELOCITYY = defVelocityY;

    }

    @Override
    public void update() {
        if (leftMove)
            x -= DEFAULTVELOCITYX * Gdx.graphics.getDeltaTime();
        if (rightMove)
            x += DEFAULTVELOCITYX * Gdx.graphics.getDeltaTime();
        if (upMove)
            y += DEFAULTVELOCITYY * Gdx.graphics.getDeltaTime();
        if (downMove)
            y -= DEFAULTVELOCITYY * Gdx.graphics.getDeltaTime();
    }

    public void moveHorizontal(boolean moveRight) {
        if (moveRight)
            velocityX = DEFAULTVELOCITYX;
        else
            velocityX = -DEFAULTVELOCITYX;
    }

    public void moveVertical(boolean moveDown) {
        if (moveDown)
            velocityY = -DEFAULTVELOCITYY;
        else
            velocityY = +DEFAULTVELOCITYY;
    }

    // Getters

    public float getVelocityX() {
        return velocityX;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setters

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setDEFAULTVELOCITYX(float DEFAULTVELOCITYX) {
        this.DEFAULTVELOCITYX = DEFAULTVELOCITYX;
    }

    public void setDEFAULTVELOCITYY(float DEFAULTVELOCITYY) {
        this.DEFAULTVELOCITYY = DEFAULTVELOCITYY;
    }

    public void setLeftMove(boolean t)
    {
        if(rightMove && t) rightMove = false;
        leftMove = t;
    }
    public void setRightMove(boolean t)
    {
        if(leftMove && t) leftMove = false;
        rightMove = t;
    }

    public void setUpMove(boolean t)
    {
        if(downMove && t) downMove = false;
        upMove = t;
    }
    public void setDowntMove(boolean t)
    {
        if(upMove && t) upMove = false;
        downMove = t;
    }
}
