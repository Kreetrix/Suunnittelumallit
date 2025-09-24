package Assignment_15;

public class Main {
    public static void main(String[] args) {
        NewDateInterface myDate = new CalendarToNewDateAdapter();
        myDate.setYear(2000);
        myDate.setMonth(5);
        myDate.setDay(24);

        System.out.println("Original date: " + myDate.getYear() + "-" + myDate.getMonth() + "-" + myDate.getDay());

        myDate.advanceDays(100);

        System.out.println("After advance: " + myDate.getYear() + "-" + myDate.getMonth() + "-" + myDate.getDay());

        myDate.advanceDays(1000);
        System.out.println("After advance: " + myDate.getYear() + "-" + myDate.getMonth() + "-" + myDate.getDay());
    }
}
