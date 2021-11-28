package proyecto.DAO.Users;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import proyecto.ClasePrueba;
import proyecto.Lists.UserList;
import proyecto.sampleClasses.User;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class ReaderManager_US {

    private BufferedReader reader;
    UserList lista = ClasePrueba.lista_UserList; // atributo statico de la lista de preguntas

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public User read() throws IOException {
        User u = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            u = new User();
            datos = line.split("-"); // separa el String en un array
            u.setUsername(datos[0]); // lee el enunciado
            u.setPassword((datos[1]));

        }
        return u;
    }

    public void readAll() throws IOException {
        User u;
        while ((u = read()) != null) {
            lista.setUser(u);
        }
    }

    public void close() throws IOException {
        reader.close();
    }
}
