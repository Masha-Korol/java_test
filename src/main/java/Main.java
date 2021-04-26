import models.Employee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ListOfEmployees listEmp = new ListOfEmployees();
        ArrayList<Employee> list = new ArrayList<Employee>();
        listEmp.createList("./src/main/resources/foreign_names.csv", ';');
    }
}
