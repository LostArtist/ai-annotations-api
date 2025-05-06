package org.aiannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnntotationAPI {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface AiSnippet {
        String valueQuestion(); // question about the code
        String valueAnswer(); //answer about the code
    }
}
