package jdk8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalFeatureExercises {

    @Test
    public void isPresent_WrapNullObject_ReturnFalse(){
        Optional<Object> optional = Optional.ofNullable(null);
        Assertions.assertFalse(optional.isPresent());
    }

    @Test
    public void isPresent_WrapNonNullObject_ReturnTrue(){
        Optional<Object> optional = Optional.ofNullable(new Object());
        Assertions.assertFalse(optional.isPresent());
    }
}
