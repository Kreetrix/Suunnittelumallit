package src;

public class Employee extends Component {

    protected int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void remove(Component component) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void add(Component component) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public String getXML(int space) {
        String indent = "    ".repeat(space);
        return String.format("%s<employee name=\"%s\" salary=\"%d\"/>", indent, name, salary);
    }

}
