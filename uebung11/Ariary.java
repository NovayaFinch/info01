public class Ariary extends Currency {
  public Ariary() {
    super(1, 0, ',');
  }

  public Ariary(int t_ariary, int t_iraimbilanja) {
    super(t_ariary, t_iraimbilanja, ',');
  }

  public int getAriary() {
    return super.getUnits();
  }

  public int getIraimbilanja() {
    return super.getFractions();
  }

  public void normalize() {
    // Kopiere die Variablen, da wir keinen direkten Zugriff auf sie haben
    int l_units = super.getUnits();
    int l_fractions = super.getFractions();

    // Zieht so lange eine unit ab, bis fractions groeßer Null ist
    while (l_fractions < 0) {
      l_units--;
      l_fractions = 5 - l_fractions;
    }

    // Rechnet so lange eine l_units rauf, bis fractions kleiner Null ist
    while (l_fractions >= 5) {
      l_fractions -= 5;
      l_units++;
    }

    super.setUnits(l_units);
    super.setFractions(l_fractions);
  }

  public String toString() {
    return String.format(
        "%d MAG%c %d Iraimbilanja", super.getUnits(), super.getSeperator(), super.getFractions());
  }
}
