public class Testing {
  public static void main(String[] args) {
    Dollar dollar = new Dollar();
    Euro euro = new Euro();
    Ariary ariary = new Ariary();

    dollar = dollar.exchange(euro);
    System.out.println(dollar);
  }
}
