import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            // JSON file to Java object
            EmployeeList[] staff = mapper.readValue(new File("employees.json"), EmployeeList[].class);


            for(EmployeeList employeeLists : staff) {
                System.out.println(employeeLists.getEmployee().getFirstName());
                System.out.println(employeeLists.getEmployee().getLastName());
                System.out.println(employeeLists.getEmployee().getWebsite());

                Employee emp = employeeLists.getEmployee();
                System.out.println(emp.getFirstName());
                System.out.println(emp.getLastName());
                System.out.println(emp.getWebsite());


            }




                //employeeList.getEmployee().getLastName();
                //employeeList.getEmployee().getWebsite();

                    // JSON string to Java object
           // String jsonInString = "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
           // EmployeeList staff2 = mapper.readValue(jsonInString, EmployeeList.class);

            // compact print
            //System.out.println(staff2);

            // pretty print
           // String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff2);

            //System.out.println(prettyStaff1);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}