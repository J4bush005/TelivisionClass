class Main {
  public static void main(String[] args) {
    Television a = new Television();
      a.setSize(60);
      a.setBrand("LG");
      a.setNumber(8);
    Television b = new Television("Vizio");
    Television c = new Television("LG", 51, true, 9);
    Book e = new Book("Arthur", "Seuss", 240);
    Television d = new Television(e);

    System.out.println(b);

    a.findBrand();
    a.findSize();
    a.turnOn();
    a.toString();
    //From Charlie's book class
    a.findBook();

    b.findBrand();
    b.findSize();
    b.turnOn();
    b.toString();
    //Create some space
    System.out.println();

    c.findBrand();
    c.findSize();
    c.turnOn();
    c.toString();
    
    
    
  }
}