package com.flex.client;

import com.flex.client.module.ModuleManager;
import net.fabricmc.api.ClientModInitializer;

public class FlexClient implements ClientModInitializer {
    public static final String MOD_ID = "flexclient";
    public static FlexClient INSTANCE;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        ModuleManager.init();
        System.out.println("[FlexClient] Yüklendi!");
    }
}
