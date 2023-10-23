package org.com.example;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class GreetingResource {
    public static void main(String[] args) {
        Quarkus.run(args);
    }
}
