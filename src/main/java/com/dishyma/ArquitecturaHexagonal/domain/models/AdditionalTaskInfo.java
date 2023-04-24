package com.dishyma.ArquitecturaHexagonal.domain.models;

public class AdditionalTaskInfo {
    private final Long userId;
    private final String userName;
    private final String email;

    public AdditionalTaskInfo(Long userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
