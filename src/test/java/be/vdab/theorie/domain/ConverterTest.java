package be.vdab.theorie.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ConverterTest {
    @Test
    void eenInchIs2Komma54Centimeters(){
        Assertions.assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ONE)).isEqualByComparingTo("2.54");
    }
}
