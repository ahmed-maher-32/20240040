import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        View view = new View();
        controller controller = new controller(view);


        int choose;

        do {
            System.out.println("Employee System");
            System.out.println("1. Add Employee");
            System.out.println("2. display all employees");
            System.out.println("3. edit Employee");
            System.out.println("4. remove Employee");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter Employee ID");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Employee Name");
                    String name = input.nextLine();

                    System.out.println("Enter Employee salary");
                    double salary = input.nextDouble();
                    input.nextLine();

                    System.out.println("Enter Employee department");
                    String department = input.nextLine();

                    controller.addEmployee(id, name, salary, department);
                case 2:
                    controller.displayall();

                case 3:
                    System.out.println("Enter Employee ID");
                    int editid = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter Employee Name");
                    String newname = input.nextLine();

                    System.out.println("Enter Employee salary");
                    double newsalary = input.nextDouble();
                    input.nextLine();

                    System.out.println("Enter Employee department");
                    String newdepartment = input.nextLine();

                    controller.editEmployee(editid, newname, newsalary, newdepartment);
                case 4:
                    System.out.println("Enter Employee ID you want to remove");
                    int removeid = input.nextInt();
                    input.nextLine();
                    controller.deleteEmployeebyid(removeid);
                case 5:
                    System.out.println("ended");
                    break;


                default:
                    System.out.println("Invalid choice");
            }


        } while (choose != 5);
    }
}