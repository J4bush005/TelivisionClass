public class Television extends Book {
  private String brand;
  private int size;
  private int number;
  private Book book;
  private boolean isOn;


  //Constructors

  public Television(Book b) {
       this();
       book=b;
  }

  public Television() {
    brand = "Samsung";
    size = 51;
    isOn = false;
    number = 1;
  }
  public Television(String brand) {
    size = 51;
    isOn = false;
    number = 2;
    this.brand = brand;
  }
  public Television(String brand, int size, boolean isOn, int number) {
    this.brand = brand;
    this.size = size;
    this.isOn = isOn;
    this.number = number;
  }

  //Methods
  public void turnOn() {
    boolean isOn = true;
    System.out.println("This tv is on");
  }

  public void findSize() {
    System.out.println("Size: " + size);
  }

  public void findBrand() {
    System.out.println("Brand: " + brand);
  }

  public void findBook() {
    System.out.println("OMG...I just saw " + tooString() + " while watching Bleach!!!" + "\n");
  }

  @Override
  public String toString() {
    return "The " + brand + " television" + " is currently playing Bleach" + "\n";  
  }

  // accessor
  public int getNumber() {return number;}
  public String getBrand() {return brand;}
  public int getSize() {return size;}

  //mutator
  public void setSize(int b) {size = b;}
  public void setBrand(String c) {brand = c;}
  public void setNumber(int d) {number = d;}


}