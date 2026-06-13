package com.url.shortener.dtos;

import lombok.Data;

import java.util.Set;
@Data
public class RegisterRequst {
    private String username;
    private String email;
    private Set<String> role;
    private String password;
}
