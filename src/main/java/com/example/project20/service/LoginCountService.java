package com.example.project20.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class LoginCountService {

    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
