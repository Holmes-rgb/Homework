import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class tester {
    public static void main(String[] args){
        Taxi taxi = new Taxi(new Person("Pat Hampton", "99 Second St, Burlington, VT 05401", "802-578-3987"),
                "Dodge", "Durango", 2015, 78888, 7, true,
                new Person("Pat Hampton", "99 Second St, Burlington, VT 05401", "802-578-3987"), "34F98G4HA");
        System.out.println(taxi);
    }
}
