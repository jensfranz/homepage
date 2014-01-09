package de.franz.homepage.controller;

import de.franz.homepage.controller.impl.BlaImpl;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

@Named
@SessionScoped
public class UserBean implements Serializable {

    @Inject
    BlaImpl bla;

    private static Logger LOGGER = Logger.getLogger(UserBean.class.getName());


    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        LOGGER.fine("accessing name on Userbean");

        if (name == null)
            return bla.b();
        else
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}