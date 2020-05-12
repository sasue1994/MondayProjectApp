package com.shs.app.propoties;

import javax.validation.constraints.Pattern;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties("day")
@Validated
public class AppPropoties {
    /**
     * API token ("user:tokensample")
     */
    @Pattern(regexp = "\\w+:\\w") 
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }
}