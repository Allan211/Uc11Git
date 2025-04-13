import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class conectaDAO { 
    public Connection conn;
    
    public String url = "jdbc:mysql://localhost:3306/uc11github";
    public String user = "root";
    public String password = "211006";
    
    public boolean conectar() {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, password);
            
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco de dados: "+ ex.getMessage());
            return false;
        }
    }
    
    public void desconectar() {
         try {
            conn.close();
        } catch (SQLException ex) {}
    }
    
}