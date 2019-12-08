package com.example.opengl2d.engine;

import android.graphics.PointF;

/**
 * The interface Game object.
 */
public interface IGameObject {
    /**
     * Draw.
     *
     * @param vPMatrix the v p matrix
     */
    void draw(float[] vPMatrix);

    /**
     * Update.
     */
    void update();

    /**
     * Gets position.
     *
     * @return the position
     */
    PointF getPosition();
}
