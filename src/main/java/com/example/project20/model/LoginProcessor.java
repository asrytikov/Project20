package com.example.project20.model;

import com.example.project20.service.LoggedUserManagementService;
import com.example.project20.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login(){
        loginCountService.increment();
        String username = this.getUsername();
        String password = this.getPassword();

        boolean loginResult = false;
        if ("user".equals(username) && "pass".equals(password)){
            loginResult = true;
            loggedUserManagementService.setUsername(username);}
        /*    return true;
        }else{
            return false;
        }*/
            return loginResult;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
