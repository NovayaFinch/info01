interface Separable {
  int getUnits();

  int getFractions();

  void setSeperator(char t_seperator);

  void normalize();
}

public class Currency implements Separable {
  private int units, fractions;
  private char seperator;

  public Currency() {
    units = 1;
  }

  public Currency(int t_units, int t_fractions, char t_seperator) {
    this.units = t_units;
    this.fractions = t_fractions;
    this.seperator = t_seperator;
    this.normalize();
  }

  public Currency(Currency t_other) {
    // Ruft den anderen constructor auf
    this(t_other.getUnits(), t_other.getFractions(), t_other.getSeperator());
  }

  public int getUnits() {
    return units;
  }

  public int getFractions() {
    return fractions;
  }

  protected void setUnits(int t_units) {
    this.units = t_units;
  }

  protected void setFractions(int t_fractions) {
    this.fractions = t_fractions;
  }

  public void setSeperator(char t_seperator) {
    this.seperator = t_seperator;
  }

  protected char getSeperator() {
    return seperator;
  }

  public void normalize() {
    // Zieht so lange eine unit ab, bis fractions groeßer Null ist
    while (fractions < 0) {
      units--;
      fractions = 100 - fractions;
    }

    // Rechnet so lange eine unit rauf, bis fractions kleiner Null ist
    while (fractions >= 100) {
      fractions -= 100;
      units++;
    }
  }

  public String toString() {
    return String.format("%d%c%02d", units, seperator, fractions);
  }
}
