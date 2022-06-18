package springboot.nag;

public class AddEmployees {
    public AddEmployees(Integer id, String name, String address) {
    }

    public void display() {
    }

    public static class AddEmployess {
        private int id;
        private String name;
        private String address;
        public AddEmployess(int id, String name, String address) {
            this.id=id;
            this.name=name;
            this.address=address;
        }
       public void  display() {
           System.out.println("Employee id "+id);
           System.out.println("Employee name "+name);
           System.out.println("Employee address "+address);

        }
    }
}
