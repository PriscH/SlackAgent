package com.prisch.oauth.model;

import com.google.gson.annotations.SerializedName;

public class OAuthBot {

    @SerializedName("bot_user_id")
    private String userId;

    @SerializedName("bot_access_token")
    private String accessToken;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
