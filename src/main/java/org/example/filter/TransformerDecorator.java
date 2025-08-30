package org.example.filter;

import java.util.List;

public class TransformerDecorator {
    private final List<Transform> transformers;

    public TransformerDecorator(List<Transform> transformers) {
        this.transformers = transformers;
    }
    public String runTransformers(String input) {
        for(Transform transform: transformers) {
            input = transform.transform(input);
        }
        return input;
    }
}
