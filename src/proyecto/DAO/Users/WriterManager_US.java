package proyecto.DAO.Users;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import proyecto.ClasePrueba;
import proyecto.Lists.UserList;
import proyecto.sampleClasses.UniqueSelection;
import proyecto.sampleClasses.User;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class WriterManager_US {

    private BufferedWriter writer;
    UserList lista = ClasePrueba.lista_UserList; // atributo statico de la lista de preguntas    

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(User u) throws IOException {
        writer.write(u.toString() + "\n");
    }

    public void writeAll() throws IOException {
        for (int i = 0; i < lista.getTAMANO(); i++) {
            User e = lista.getElemento(i);
            if (e != null) {
                write(e);
            }
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}
