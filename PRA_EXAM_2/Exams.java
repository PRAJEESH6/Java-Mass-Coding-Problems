package PRA_EXAM_2;


import java.util.*;

class Employee{

    private int employee_id;
    private String employee_name;
    private String employee_branch;
    private double employee_rating;
    private boolean company_transport;

    Employee(int employee_id,String employee_name,String employee_branch,double employee_rating,boolean company_transport)
    {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_branch = employee_branch;
        this.employee_rating = employee_rating;
        this.company_transport = company_transport;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_branch() {
        return employee_branch;
    }

    public void setEmployee_branch(String employee_branch) {
        this.employee_branch = employee_branch;
    }

    public double getEmployee_rating() {
        return employee_rating;
    }

    public void setEmployee_rating(double employee_rating) {
        this.employee_rating = employee_rating;
    }

    public boolean isCompany_transport() {
        return company_transport;
    }

    public void setCompany_transport(boolean company_transport) {
        this.company_transport = company_transport;
    }
}

public class Exams {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh...");
        System.out.println("Give Some Basic Employee Details..");

        int ArraySize = 4;

        Scanner in = new Scanner(System.in);
        Employee[] employees = new Employee[ArraySize];

        for (int i=0;i<employees.length;i++)
        {
            System.out.println("ENTER THE EMPLOYEE ID");
            int id = in.nextInt();in.nextLine();
            System.out.println(" ");

            System.out.println("ENTER THE EMPLOYEE NAME");
            String name = in.nextLine();
            System.out.println(" ");

            System.out.println("ENTER THE EMPLOYEE BRANCH");
            String branch = in.nextLine();
            System.out.println(" ");

            System.out.println("ENTER THE EMPLOYEE RATING");
            double rating = in.nextDouble();in.nextLine();
            System.out.println(" ");

            System.out.println("IF THEY ARE USE COMPANY TRANSPORT (If YES PRESS 1 OR IF NO PRESS 0)");
            boolean transport = in.nextBoolean();in.nextLine();
            System.out.println(" ");
            System.out.println("************************** Thank U ********************");
            System.out.println(" ");

            employees[i] = new Employee(id,name,branch,rating,transport);

        }

        for (int p=0;p<employees.length;p++)
        {
            System.out.println("*********************************************");

            System.out.println(employees[p].getEmployee_id());
            System.out.println(employees[p].getEmployee_name());
            System.out.println(employees[p].getEmployee_branch());
            System.out.println(employees[p].getEmployee_rating());
            System.out.println(employees[p].isCompany_transport());

            System.out.println("*********************************************");
        }

        System.out.println(" ");
        System.out.println("ENTER YOUR BRANCH...");
        String Userbranch = in.nextLine();
        System.out.println(" ");

        int Cdata = findCountOfEmployeesUsingCompTransport(employees,Userbranch);

        if (Cdata > 0)
        {
            System.out.println(Cdata);
        }else {
            System.out.println("No Employees Found Based On Your Attributes..");
        }

        Employee RatingBased = findEmployeeWithSecondHighestRating(employees);

        if (RatingBased != null)
        {
            System.out.println(" ");
            System.out.println("********************************************");

            System.out.println(RatingBased.getEmployee_id());
            System.out.println(RatingBased.getEmployee_name());
            System.out.println(RatingBased.getEmployee_branch());
            System.out.println(RatingBased.getEmployee_rating());
            System.out.println(RatingBased.isCompany_transport());

            System.out.println(" ");
            System.out.println("********************************************");

        }else {
            System.out.println("All Employees Using Companies Transport...");
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee[] employees,String branch)
    {
        int count = 0;

        for (int i=0;i<employees.length;i++)
        {
            if (employees[i].getEmployee_branch().equals(branch) && employees[i].isCompany_transport())
            {
                count++;
            }
        }

        if (count > 0)
        {
            return count;
        }else {
            return 0;
        }

    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] employees)
    {
        List<Employee> EmployeeFilter = new ArrayList<>();

        for (int i=0;i<employees.length;i++)
        {
            if (!employees[i].isCompany_transport())
            {
                EmployeeFilter.add(employees[i]);
            }
        }

        if (EmployeeFilter.size() < 2)
        {
            return null;
        }

        Collections.sort(EmployeeFilter, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getEmployee_rating(),o2.getEmployee_rating());
            }
        });

        return EmployeeFilter.get(1);
    }
}
