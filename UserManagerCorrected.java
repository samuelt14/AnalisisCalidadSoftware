import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * Gestor de usuarios que mantiene una lista en memoria.
 * Provee operaciones para añadir y listar usuarios, con
 * validaciones y separación de responsabilidades.
 */
public class UserManager {
    private static final Logger LOGGER = Logger.getLogger(UserManager.class.getName());
    private static final int MAX_USERS = 10;

    // Lista dinámica para almacenar usuarios
    private final List<String> users = new ArrayList<>();

    /**
     * Intenta añadir un nuevo usuario.
     *
     * @param username nombre del usuario (no nulo, no vacío, no duplicado)
     * @return true si el usuario se añadió correctamente
     * @throws IllegalArgumentException si el nombre es inválido o ya existe
     * @throws IllegalStateException    si se alcanza el número máximo de usuarios
     */
    public boolean addUser(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío.");
        }
        if (users.contains(username)) {
            throw new IllegalArgumentException("El usuario '" + username + "' ya existe.");
        }
        if (users.size() >= MAX_USERS) {
            throw new IllegalStateException("Capacidad máxima de usuarios (" 
                                            + MAX_USERS + ") alcanzada.");
        }

        users.add(username);
        LOGGER.info("Usuario añadido: " + username);
        return true;
    }

    /**
     * Devuelve una lista inmodificable con los nombres de todos los usuarios.
     *
     * @return lista de usuarios
     */
    public List<String> listUsers() {
        return Collections.unmodifiableList(users);
    }
}
