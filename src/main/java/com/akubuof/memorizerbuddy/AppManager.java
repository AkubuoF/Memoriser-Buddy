package com.akubuof.memorizerbuddy;

import java.net.URL;

public class AppManager {
    private AppManager(){}

    public static URL getResource(String name) {
        return AppManager.class.getResource(name);
    }
}
