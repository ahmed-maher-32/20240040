public class employee {
    private int  id ;
    private String name;
    private double salary;
    private String department;
    public employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }
    public String getdepartment() {
        return department;
    }
    public void setdepartment(String department) {
        this.department = department;
    }

}
