

import static org.assertj.core.api.Assertions.assertThat;

import be.vdab.domain.Converter;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ConverterTest {
    @Test
    void eenInchIs2Komma54Centimeters(){
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ONE)).isEqualByComparingTo("2.54");
    }
}
