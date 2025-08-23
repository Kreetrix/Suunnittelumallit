package src;

public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract int getSalary();

    public abstract void remove(Component component);

    public abstract void add(Component component);

    public abstract String getXML(int space);
}