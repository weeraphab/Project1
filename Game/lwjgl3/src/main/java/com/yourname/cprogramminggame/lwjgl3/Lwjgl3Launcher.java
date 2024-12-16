package com.yourname.cprogramminggame.lwjgl3;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.yourname.cprogramminggame.MainGame;

public class Lwjgl3Launcher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("C Programming Game");
        config.setWindowedMode(800, 600);
        new Lwjgl3Application(new MainGame(), config);
    }
}
