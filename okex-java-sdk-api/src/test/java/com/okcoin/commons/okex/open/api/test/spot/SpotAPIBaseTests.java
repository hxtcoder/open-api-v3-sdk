package com.okcoin.commons.okex.open.api.test.spot;

import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.enums.I18nEnum;
import com.okcoin.commons.okex.open.api.test.BaseTests;

public class SpotAPIBaseTests extends BaseTests {

    public APIConfiguration config() {
        final APIConfiguration config = new APIConfiguration();

        config.setEndpoint("https://www.okex.com/");
        // apiKey，api注册成功后页面上有
        config.setApiKey("525a6f73-65ec-4a97-a6cc-9d0b6397c33d");
        // secretKey，api注册成功后页面上有
        config.setSecretKey("F5DA837748597670C0C3CDD4F599F7DA");
        config.setPassphrase("helloxxd123");
        config.setPrint(true);
        config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);

        return config;
    }

}
