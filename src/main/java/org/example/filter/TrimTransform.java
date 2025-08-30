package org.example.filter;

public class TrimTransform implements Transform{

    @Override
    public String transform(String input) {
        return input.trim();
    }
}
