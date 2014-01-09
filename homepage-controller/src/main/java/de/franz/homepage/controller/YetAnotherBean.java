package de.franz.homepage.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created by jens on 09.01.14.
 */
@Named
@ApplicationScoped
public class YetAnotherBean {

    private String bla = "bla";

    public String getBla() {
        return "bla";
    }

    /*public void setBla(String bla) {
        this.bla = bla;
    }*/
}
