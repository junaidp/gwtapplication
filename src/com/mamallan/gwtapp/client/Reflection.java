package com.mamallan.gwtapp.client;

public interface Reflection {
    public <T, V extends T> T instantiate( Class<V> clazz );
}