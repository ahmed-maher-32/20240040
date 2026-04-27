import java.util.ArrayList;

public class View {
    public void display(employee e){
        System.out.println("ID: "+e.getid());
        System.out.println("Name: "+e.getname());
        System.out.println("salary: "+e.getsalary());
        System.out.println("Department: "+e.getdepartment());

    }
    public void showall(ArrayList<employee> employees){
        if (employees.size()==0){
            System.out.println("No employees found");
        }
        else{
            for (employee e:employees){
                display(e);
            }
        }
    }
}
