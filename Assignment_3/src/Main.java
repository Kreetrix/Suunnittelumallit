package src;

public class Main {
    public static void main(String[] args) {
        Department organization = new Department("Organization");

        Department department_1 = new Department("Department 1");
        Department department_2 = new Department("Department 2");

        Employee alex = new Employee("Alex", 4000);
        Employee pekka = new Employee("Pekka", 5000);
        Employee niko = new Employee("Niko", 8000);
        Employee ilkka = new Employee("Ilkka", 10000);

        department_1.add(niko);
        department_1.add(pekka);
        
        department_2.add(ilkka);

        department_1.add(department_2);

        organization.add(alex);
        organization.add(department_1);

        int salary = organization.getSalary();
        System.out.println("Organization salary -> " + salary);

        System.out.println(organization.getXML(0));

        department_1.remove(niko);
        department_1.remove(department_2);


        System.out.println("");
        System.out.println(organization.getXML(0));
        salary = organization.getSalary();
        System.out.println("\nOrganization salary -> " + salary);


    }
}
