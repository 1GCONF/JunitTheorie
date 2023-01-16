import be.vdab.domain.Jaar;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JaarTest {
    @Test
    @DisplayName("Een jaar deelbaar door 400 is een schrikkeljaar.")
    void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
        assertThat(new Jaar(2000).isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
        assertThat(new Jaar(1900).isSchrikkeljaar()).isFalse();
    }
    @Test
    void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
        assertThat(new Jaar(2012).isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
        assertThat(new Jaar(2015).isSchrikkeljaar()).isFalse();
    }
    @Test
    void toStringGeeftHetJaarAlsTekst() {
        assertThat(new Jaar(2015)).hasToString("2015");
    }
    @Test
    void jarenMetHetzelfdeJaartalZijnGelijk(){
        assertThat(new Jaar(2015)).isEqualTo(new Jaar(2015));
    }
    @Test
    void jarenMetEenVerschillendJaartalZijnVerschillend(){
        assertThat(new Jaar(2015)).isNotEqualTo(new Jaar(2016));
    }
}
