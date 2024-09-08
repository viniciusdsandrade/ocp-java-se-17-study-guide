import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class MyFirstDatabaseConnection {
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PORT = "3306";
    private static final String MYSQL_DATABASE = "db_jdbc_mysql_chapter_15";
    private static final String MYSQL_URL = "jdbc:mysql://localhost:" + MYSQL_PORT + "/" + MYSQL_DATABASE;
    private static final String MYSQL_PASSWORD = "GhostSthong567890@";

    private static final String POSTGRES_USER = "postgres";
    private static final String POSTGRES_PORT = "5432";
    private static final String POSTGRES_DATABASE = "db_jdbc_postgresql_chapter_15";
    private static final String POSTGRES_URL = "jdbc:postgresql://localhost:" + POSTGRES_PORT + "/" + POSTGRES_DATABASE;
    private static final String POSTGRES_PASSWORD = "GhostSthong567890@";

    private static final String SQL_SERVER_USER = "AndradeDell";
    private static final String SQL_SERVER_PORT = "1433";
    private static final String SQL_SERVER_DATABASE = "db_jdbc_sql_server_chapter_15";
    private static final String SQL_SERVER_URL = "jdbc:sqlserver://" + SQL_SERVER_USER + ";databaseName=" + SQL_SERVER_DATABASE + ";IntegratedSecurity=true;encrypt=true;trustServerCertificate=true";

    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM tb_employees");
                ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }
        }
        try (
                Connection conn = getConnection(POSTGRES_URL, POSTGRES_USER, POSTGRES_PASSWORD);
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM tb_employees");
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }
        }

        try (
                Connection conn = getConnection(SQL_SERVER_URL);
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM tb_employees");
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }
        }
    }
}
