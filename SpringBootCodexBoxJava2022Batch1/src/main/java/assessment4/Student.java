package assessment4;
public class Student {
    private Integer stdNo;
    private String stdName;
    private String stdAddress;
    private Integer stdMarks;
    public Student(Integer id, String name, String address, Integer totalMarks) {
        this.stdNo=id;
        this.stdName=name;
        this.stdAddress=address;
        this.stdMarks=totalMarks;
    }
    public Integer getStdNo() {
        return stdNo;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public Integer getStdMarks() {
        return stdMarks;
    }
}

