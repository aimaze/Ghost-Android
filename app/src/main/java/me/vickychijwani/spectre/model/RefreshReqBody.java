package me.vickychijwani.spectre.model;

@SuppressWarnings("unused")
public class RefreshReqBody {

    public final String grantType = "refresh_token";
    public final String refreshToken;
    public final String clientId = "ghost-admin";

    public RefreshReqBody(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
