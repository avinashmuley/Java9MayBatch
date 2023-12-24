package jdbc;

//import java.sql.connection;
public class jdbcUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sept25java";
        String username = "Avinash";
        String password = "Avinash@123";
        String sql = "update emp set sal = 9000 where empno = 8562";
    }
}
