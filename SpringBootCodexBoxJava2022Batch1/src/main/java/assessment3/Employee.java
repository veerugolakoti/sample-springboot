package assessment3;

public  class Employee {
     public  Integer Id;
     public String Name;
     public  String Address;
     public Employee(String Id, String name, String address)
     {
          this.Id = Integer.valueOf(Id);
          this.Name = name;
          this.Address=address;
     }
}

