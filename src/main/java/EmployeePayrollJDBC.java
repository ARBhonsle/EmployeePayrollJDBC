import java.sql.*;

public class EmployeePayrollJDBC {
    static Connection connection;
    static Statement statement;

    public void executeGivenQuery(String query) throws SQLException {
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        for(int i=1;i<=resultSetMetaData.getColumnCount();i++){
            System.out.println(resultSetMetaData.getColumnLabel(i));
        }
    }

    public EmployeePayrollJDBC(String url, String user, String password) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
