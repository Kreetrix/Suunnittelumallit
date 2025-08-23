package src;

import java.util.ArrayList;
import java.util.List;

public class Department extends Component {

    private List<Component> departments = new ArrayList<>();
    private List<Component> employees = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        int salary = 0;
        for (Component d : departments) {
            salary += d.getSalary();
        }
        for (Component e : employees) {
            salary += e.getSalary();
        }
        return salary;
    }

    @Override
    public void remove(Component component) {
        if(component instanceof Department) {
            System.out.println("Removed -> " + component.name);
            this.departments.remove(component);
        }
        else if(component instanceof Employee){
            System.out.println("Removed -> " + component.name);
            this.employees.remove(component);
        }
        
    }

    @Override
    public void add(Component component) {
        if(component instanceof Department) {
            this.departments.add(component);
        }
        else if(component instanceof Employee){
            this.employees.add(component);
        }
    }

    @Override
    public String getXML(int space) {
        String indent = "    ".repeat(space);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s<department name=\"%s\">\n", indent, name));

        if(!employees.isEmpty()){
            for (Component e : employees) {
                sb.append(e.getXML(space + 1)).append("\n");
            }
        }
        
        if(!departments.isEmpty()){
            for (Component d : departments) {
                sb.append(d.getXML(space + 1)).append("\n");
            }
        }

        sb.append(String.format("%s</department>", indent));
        return sb.toString();
    }

    
}
