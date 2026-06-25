package com.flex.client.module;

public class Module {
    private final String name;
    private final String category;
    private boolean enabled;

    public Module(String name, String category) {
        this.name = name;
        this.category = category;
        this.enabled = false;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean e) { this.enabled = e; }
    public void toggle() { this.enabled = !this.enabled; }
}
