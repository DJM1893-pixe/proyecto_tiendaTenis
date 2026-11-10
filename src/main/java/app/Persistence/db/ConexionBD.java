package app.Persistence.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {


    private static ConexionBD instance;
    private final Connection connection;

    // Ojo esto se conoce como una mala práctica , porque expone los secretos de la app
    // En su defecto usar un gestor o enmascaramientpo de datos
    private static final String url = "jdbc:mysql://localhost:3306/tienda_tenis";
    private static final String userName = "root";
    private static final String password = "";


    private ConexionBD(){

        try{

            connection = DriverManager.getConnection(url, userName , password);
            System.out.println("Conexión exitosa a la base de datos");
        }catch (SQLException e){
            throw new RuntimeException("Error al conectar a la base de datos");
        }
    }

    public static synchronized ConexionBD getInstance(){

        if( instance == null ){
            instance = new ConexionBD();
        }
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }





}