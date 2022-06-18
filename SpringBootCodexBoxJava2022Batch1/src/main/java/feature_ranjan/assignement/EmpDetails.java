package feature_ranjan.assignement;

public class EmpDetails {
    private Integer empId;
    private String empName;
    private String empAdd;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String EmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }
            void empMethod(){
                System.out.println(empId);
                System.out.println(empName);
                System.out.println(empAdd);

            }
}
