package org.example.filter;


public class LowercaseTransform implements Transform {
    @Override
    public String transform(String input) {
        return input.toLowerCase();
    }
}
