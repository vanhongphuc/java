package Package;

public class Employee extends Person {
  protected String position;
  public void addPosition(){
    System.out.println("Nhập vị trí");
    position = sc.nextLine();
  }
  public void displayPosition(){
    System.out.println("Chức vụ: "+ position);
  }
}