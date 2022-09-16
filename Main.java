class Main {
  public static void main(String[] args) {
    Television a = new Television();
      a.setSize(60);
      a.setBrand("LG");
      a.setNumber(8);
    Television b = new Television("Vizio");
    Television c = new Television("LG", 51, true, 9);

    System.out.println(b);

    a.turnOn();
    a. getSize();
    a.getBrand();
    a.toString();
    b.turnOn();
    b. getSize();
    b.getBrand();
    c.turnOn();
    c.getSize();
    c.getBrand();
    
  }
}