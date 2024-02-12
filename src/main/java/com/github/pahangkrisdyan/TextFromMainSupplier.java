package com.github.pahangkrisdyan;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.function.Supplier;

@Singleton
@Named("text-from-main-supplier")
public class TextFromMainSupplier implements Supplier<String> {

    @Override
    public String get() {
        return "This is a text from main! :)";
    }
}
