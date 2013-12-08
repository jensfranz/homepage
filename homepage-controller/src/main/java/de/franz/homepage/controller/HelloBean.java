package de.franz.homepage.controller;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

//@ManagedBean
//@ApplicationScoped
@Named
public class HelloBean implements Serializable {

    @Inject
    Bla bla;

    @Inject
    private Logger logger;


    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //logger.log(Level.FINEST, "setting");
        this.name = name + (bla == null);
    }

}