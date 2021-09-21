import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class EmployeePayrollTest {
    @Test
    public void givenUrlUserPasswordQuery_checksConnectionToDatabase_returnsQuery() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/payroll_service";
        String user = "root";
        String password = "root@1234";
        String query = "select * from employee_details;";
        EmployeePayrollJDBC payroll = new EmployeePayrollJDBC(url, user, password);
        payroll.executeGivenQuery(query);
    }

    @Test
    public void givenUrlUserPasswordQuery_returnsEmployeePayrollFormDatabase() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/payroll_service";
        String user = "root";
        String password = "root@1234";
        String query = "select * from employee_payroll;";
        EmployeePayrollJDBC payroll = new EmployeePayrollJDBC(url, user, password);
        payroll.executeGivenQuery(query);
    }
}
