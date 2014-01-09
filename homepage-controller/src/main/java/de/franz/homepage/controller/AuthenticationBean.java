package de.franz.homepage.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.logging.Logger;

@Named
@RequestScoped
public class AuthenticationBean {

    static final String USER_ROLE = "*";
    static final String ADMIN_ROLE = "admin";

    private static Logger LOGGER = Logger.getLogger(AuthenticationBean.class.getName());
    private HttpServletRequest request;
    private String userService;

    @PostConstruct
    public void init() {
        request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        userService = null;//UserServiceFactory.getUserService();
    }

    public String getPrincipal() {
        Principal userPrincipal = request.getUserPrincipal();
        return userPrincipal == null ? "" : userPrincipal.getName();
    }

    public boolean isAdmin() {
        return request.isUserInRole(ADMIN_ROLE);
    }

    public boolean isUser() {
        return request.isUserInRole(USER_ROLE);
    }

    public String getLogoutUrl() {
        return "logut";//userService.createLogoutURL(request.getRequestURI());
    }
}
