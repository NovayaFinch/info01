public class Euro extends Currency {
  public Euro() {
    super(1, 0, ',');
  }

  public Euro(int t_euro, int t_cent) {
    super(t_euro, t_cent, ',');
  }

  public int getEuro() {
    return super.getUnits();
  }

  public int getCent() {
    return super.getFractions();
  }

  public String toString() {
    return String.format(
        "%d%c%02d EUR", super.getUnits(), super.getSeperator(), super.getFractions());
  }
}
