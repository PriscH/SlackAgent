package com.prisch.oauth.model;

import com.google.gson.annotations.SerializedName;

public class OAuthWebhook {

    @SerializedName("url")
    private String url;

    @SerializedName("channel")
    private String channel;

    @SerializedName("configuration_url")
    private String configurationUrl;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getConfigurationUrl() {
        return configurationUrl;
    }

    public void setConfigurationUrl(String configurationUrl) {
        this.configurationUrl = configurationUrl;
    }
}
