package org.tabaqui;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
public @interface AiAutoSnippet {
    String question();                 // Required: the question
    String answerTemplate() default ""; // Optional: if empty, use default template
}
