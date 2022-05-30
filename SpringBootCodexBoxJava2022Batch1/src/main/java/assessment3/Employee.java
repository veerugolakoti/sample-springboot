package assessment3;
import java.util.Scanner;
public  class Employee {
    public String id;
    public String name;
    public String address;
    public void Details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Id : ");
        this.id = String.valueOf(sc.nextLine());
        System.out.print("Enter Address : ");
        this.address = sc.nextLine();
            System.out.print(">>>>Employee details<<<< ");
            System.out.print(name);
            System.out.print(id);
            System.out.print(address);
            System.out.println();
        }
    public String getId() {
        return id;
    }
}

