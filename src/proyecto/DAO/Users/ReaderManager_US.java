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
    UserList lista = ClasePrueba.lista_UserList;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public User read() throws IOException {
        User u = null;
        String line = reader.readLine();
        String datos[];
        if (line != null) {
            u = new User();
            datos = line.split("-");
            u.setUsername(datos[0]);
            u.setPassword((datos[1]));
            u.setWins(Integer.parseInt(datos[2]));
            u.setWins_TF(Integer.parseInt(datos[3]));
            u.setWins_US(Integer.parseInt(datos[4]));
            u.setWins_MS(Integer.parseInt(datos[5]));
            u.setLosses(Integer.parseInt(datos[6]));
            u.setLosses_TF(Integer.parseInt(datos[7]));
            u.setLosses_US(Integer.parseInt(datos[8]));
            u.setLosses_MS(Integer.parseInt(datos[9]));
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
