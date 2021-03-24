/*
 * Autor: Christian Felipe de Jesus Avila Valdes
 * Versión: 1.0
 * Fecha Creación: 3 - mar - 2021
 * Descripción:
 * Interfaz con los métodos necesarios para implementar
 * el patrón de Data Access Object para la entidad Estudiante.
 */
package Database;

import Entities.Estudiante;
import java.util.List;

/**
 * Interfaz con los métodos necesarios para implementar
 * el patrón de Data Access Object para la entidad Estudiante.
 */
public interface EstudianteDAOInterface {

    /**
     * Crea un Estudiante en la base de datos.
     * @param estudiante el Estudiante que se desea crear en la base de datos
     * @return booleano indicando el éxito o fracaso
     */
    boolean Create( Estudiante estudiante );

    /**
     * Regresa una lista con todos los Estudiantes de la base de datos.
     * @return lista con todos los Estudiantes de la base de datos.
     */
    List< Estudiante > ReadAll();

    /**
     * Regresa un estudiante de la base de datos. Utiliza una matrícula
     * para encontrar el Estudiante deseado. Regresa Null en caso de no
     * encontrar al Estudiante
     * @param matricula la matrícula del Estudiante deseado
     * @return una instancia del Estudiante
     */
    Estudiante ReadEstudiante( String matricula );

    /**
     * Actualiza un Estudiante en la base de datos con los datos del
     * Estudiante introducido.
     * @param estudianteActualizado la versión actualizada del Estudiante
     * @return booleano indicando el éxito o fracaso
     */
    boolean Update( Estudiante estudianteActualizado );

    /**
     * Elimina un Estudiante de la base de datos utilizando la
     * mastrícula introducida.
     * @param matricula la matrícula del Estudiante que se desea eliminar
     * @return booleano indicando el éxito o fracaso
     */
    boolean Delete( String matricula );
}