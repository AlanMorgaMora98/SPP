/*
 * Autor: Christian Felipe de Jesus Avila Valdes
 * Versión: 1.0
 * Fecha Creación: 3 - mar - 2021
 * Descripción:
 * Data Access Object para la entidad Estudiante. Se
 * encarga de realizar varias funciones relacionadas con Estudiantes
 * en la base de datos.
 */
package Database;

import Entities.Estudiante;
import java.sql.Statement;
import java.util.List;

public class EstudianteDAO implements EstudianteDAOInterface{
    @Override
    public boolean Create( Estudiante estudiante ) {
        boolean fueCreado = false;
        MySqlConnection connection = new MySqlConnection();
        connection.StartConnection();

        try {
            Statement statement = connection.GetConnection().createStatement();
            String query = "INSERT INTO Estudiante()";
        } catch( Exception exception ) {
            exception.printStackTrace();
        }
        return fueCreado;
    }

    @Override
    public List< Estudiante > ReadAll() {
        return null;
    }

    @Override
    public Estudiante ReadEstudiante( String matricula ) {
        return null;
    }

    @Override
    public boolean Update( Estudiante estudianteActualizado ) {
        return false;
    }

    @Override
    public boolean Delete( String matricula ) {
        return false;
    }
}
