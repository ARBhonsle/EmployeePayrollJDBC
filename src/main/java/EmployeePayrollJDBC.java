import java.sql.*;

public class EmployeePayrollJDBC {
    static Connection connection;
    static Statement statement;

    public void executeQueryToDisplayTable(String query) throws SQLException {
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        while (resultSet.next()) {
            for (int i = 0; i <= resultSetMetaData.getColumnCount(); i++) {
                if (i == 0) {
                    System.out.print(resultSetMetaData.getColumnLabel(i + 1) + "\t");
                } else {
                    System.out.print(resultSet.getString(i) + "\t");
                }
            }
            System.out.println();
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

    public void executeGivenQuery(String query) throws SQLException {
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        while (resultSet.next()) {
            for (int i = 0; i <= resultSetMetaData.getColumnCount(); i++) {
                if (i == 0) {
                    System.out.print(resultSetMetaData.getColumnLabel(i + 1) + "\t");
                } else {
                    System.out.print(resultSet.getString(i) + "\t");
                }
            }
            System.out.println();
        }
    }
}
