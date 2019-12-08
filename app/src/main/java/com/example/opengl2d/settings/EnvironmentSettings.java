package com.example.opengl2d.settings;

import android.graphics.PointF;

/**
 * The type Environment settings.
 */
public class EnvironmentSettings {
    /**
     * The constant MAX_LAUNCH_SPEED.
     */
    public static int MAX_LAUNCH_SPEED = 20;
    /**
     * The constant ACCELERATION.
     */
    public static PointF ACCELERATION = new PointF(0, -9.81f);
    /**
     * The constant BOUNCE_FRICTION.
     */
    public static float BOUNCE_FRICTION = 0.9f;
    /**
     * The constant DRAG.
     */
    public static float DRAG = 0.999f;
    /**
     * The constant SPAWN_BOX.
     */
    public static boolean SPAWN_BOX = true;
}
