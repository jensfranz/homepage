package de.franz.homepage.controller;

import de.franz.homepage.controller.impl.BlaImpl;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

@SessionScoped
@Named
public class UserBean implements Serializable {

    @Inject
    BlaImpl bla;

    //@Inject
    private Logger logger;


    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        if (name == null)
            return bla.b();
        else
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}