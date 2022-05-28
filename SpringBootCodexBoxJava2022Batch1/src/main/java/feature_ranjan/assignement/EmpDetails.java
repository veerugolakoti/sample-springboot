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
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }
    void empDataDisplay() {
        System.out.println("print all the details");
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empAdd);

    }
}
