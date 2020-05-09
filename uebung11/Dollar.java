public class Dollar extends Currency {
  public static final double EURO_RATE = 0.8152d;
  public static final double ARIARY_RATE = 3245.0d;

  public Dollar() {
    super(1, 0, ',');
  }

  public Dollar(int t_dollar, int t_cent) {
    super(t_dollar, t_cent, ',');
  }

  public int getDollar() {
    return super.getUnits();
  }

  public int getCent() {
    return super.getFractions();
  }

  public String toString() {
    return String.format(
        "%d%c%02d $", super.getUnits(), super.getSeperator(), super.getFractions());
  }

  private Dollar exchange(Currency t_other, int factor, double rate) {
    return new Dollar();
  }

  public Dollar exchange(Euro t_other) {
    int cents = (int) ((double) (t_other.getUnits() * 100 + t_other.getFractions()) / EURO_RATE);
    return new Dollar(0, cents);
  }

  public Dollar exchange(Ariary t_other) {
    int cents = (int) ((double) (t_other.getUnits() * 100 + t_other.getFractions()) / ARIARY_RATE);
    return new Dollar(0, cents);
  }
}
