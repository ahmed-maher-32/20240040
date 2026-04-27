import java.util.ArrayList;
public class controller {
    private ArrayList<employee> employees;
    private View view;
    public controller(View view) {
        this.view = view;
        employees = new ArrayList<>();
    }
    public void addEmployee(int id ,String name ,double salary, String department) {
        employee emp = new employee(id,name,salary,department);
        employees.add(emp);
        System.out.println("employee added successfully");
    }
    public void displayall(){
        view.showall(employees);
    }
    public void editEmployee(int id ,String name ,double salary, String department) {
        for(employee e:employees){
            if(e.getid()==id){
                e.setname(name);
                e.setsalary(salary);
                e.setdepartment(department);
            }
        }
        System.out.println("employee edited successfully");

    }
    public void deleteEmployeebyid(int id) {
        for(employee e:employees){
            if(e.getid()==id){
                employees.remove(e);
                System.out.println("employee deleted successfully");
            }
            else{System.out.println("employee not found");}
        }
    }
}
