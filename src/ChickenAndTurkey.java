import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChickenAndTurkey {

<<<<<<< Updated upstream
    public static void main(String[] args) {
        String username = "admin";
        String password = "chicken123";
        String urlBD = "jdbc:mysql://localhost:3306/Chickenandturkey";
        try {
            Connection conn = DriverManager.getConnection(urlBD, username, password);
            System.out.println("Cargado correctamente");
            System.out.println("Conexión exitosa a la base de datos chickenandturkey.");
            conn.close();
            dbLogin login = new dbLogin(urlBD, "admin", "chicken123");
            login.dbLoginn(); // Call dbLogin method
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
=======
	public static void main(String[] args) {
		String username = "admin";
		String password = "chicken123";
		String urlBD = "jdbc:mysql://localhost:3306/Chickenandturkey";
		try {
			Connection conn = DriverManager.getConnection(urlBD, username, password);
			System.out.println("Cargado correctamente");
			System.out.println("Conexión exitosa a la base de datos chickenandturkey.");
			conn.close();
			dbLogin login = new dbLogin(urlBD, username, password);
			login.dbLogin(); // Call dbLogin method
		} catch (SQLException e) {
			System.out.println("Error al conectar a la base de datos: " + e.getMessage());
		}
>>>>>>> Stashed changes

	}
}
