package de.franz.homepage.controller;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named
public class HelloWorld {

    @Inject
    Bla bla;

    @Inject
    Logger logger;

    public String getMessage() {
        logger.log(Level.WARNING, "hello world!");
        return "Hello, World" + (bla.b()) + "23";
    }
}