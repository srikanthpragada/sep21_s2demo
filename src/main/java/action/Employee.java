
package action;

public class Employee {
   private String id,firstName, salary;    

    public Employee() {
    }

    public Employee(String id, String firstName, String salary) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
