package tech.bison.trainee2021.tasksBlockSix;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TruncatedConeTest {
  @Test
  void newTruncatedCone_getSurface_isCorrect() {
    TruncatedCone f1 = new TruncatedCone(12, 5.3, 7.5);

    double result = f1.getSurface();

    assertThat(result).isEqualTo(1087.2213542281866);
  }

  @Test
  void newTruncatedCone_getSeathing_isCorrect() {
    TruncatedCone f1 = new TruncatedCone(12, 5.3, 7.5);

    double result = f1.getSeathing();

    assertThat(result).isEqualTo(546.5846744719191);
  }

  @Test
  void newTruncatedCone_getSeathLine_isCorrect() {
    TruncatedCone f1 = new TruncatedCone(12, 5.3, 7.5);

    double result = f1.getSeathLine();

    assertThat(result).isEqualTo(10.056838469419702);
  }

  @Test
  void newTruncatedCone_getVolume_isCorrect() {
    TruncatedCone f1 = new TruncatedCone(12, 5.3, 7.5);

    double result = f1.getVolume();

    assertThat(result).isEqualTo(1851.1049313114456);
  }
}
