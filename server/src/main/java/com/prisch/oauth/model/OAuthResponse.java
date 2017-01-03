package com.prisch.oauth.model;

import com.google.gson.annotations.SerializedName;

public class OAuthResponse {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("scope")
    private String scope;

    @SerializedName("team_name")
    private String teamName;

    @SerializedName("team_id")
    private String teamId;

    @SerializedName("incoming_webhook")
    private OAuthWebhook incomingWebhook;

    @SerializedName("bot")
    private OAuthBot bot;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public OAuthWebhook getIncomingWebhook() {
        return incomingWebhook;
    }

    public void setIncomingWebhook(OAuthWebhook incomingWebhook) {
        this.incomingWebhook = incomingWebhook;
    }

    public OAuthBot getBot() {
        return bot;
    }

    public void setBot(OAuthBot bot) {
        this.bot = bot;
    }
}
