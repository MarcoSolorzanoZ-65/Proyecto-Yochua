package proyecto.DAO.Users;

import java.io.IOException;
import proyecto.sampleClasses.User;
import proyecto.ClasePrueba;
import proyecto.Lists.UserList;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class Dao_User {

    UserList lista = ClasePrueba.lista_UserList; // atributo statico de la lista de preguntas
    WriterManager_US writer = new WriterManager_US();
    ReaderManager_US reader = new ReaderManager_US();

    public static final String FILE_NAME = "userFile.txt";

    public boolean insertar(User u) {
        lista.setUser(u);
        guardarLista(u);
        return true;
    }

    public void comparar(User u) {

    }

    public void cargarDatosPrueba() { // se agregar datos de prueba     
        try {
            reader.open(FILE_NAME);
            reader.readAll();
            reader.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
        }
    }

    public void sumarWins(int i) {
        lista.getElemento(i).setWins(lista.getElemento(i).getWins() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarWins_TF(int i) {
        lista.getElemento(i).setWins_TF(lista.getElemento(i).getWins_TF() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarWins_US(int i) {
        lista.getElemento(i).setWins_US(lista.getElemento(i).getWins_US() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarWins_MS(int i) {
        lista.getElemento(i).setWins_MS(lista.getElemento(i).getWins_MS() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarLosses(int i) {
        lista.getElemento(i).setLosses(lista.getElemento(i).getLosses() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarLosses_TF(int i) {
        lista.getElemento(i).setLosses_TF(lista.getElemento(i).getLosses_TF() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarLosses_US(int i) {
        lista.getElemento(i).setLosses_US(lista.getElemento(i).getLosses_US() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void sumarLosses_MS(int i) {
        lista.getElemento(i).setLosses_MS(lista.getElemento(i).getLosses_MS() + 1);
        User s = lista.getElemento(i);
        guardarLista(s);
    }

    public void guardarLista(User u) { // se agregar datos de prueba            
        try {
            writer.open(FILE_NAME);
            writer.writeAll();
            writer.close(); //importante cerrar el archivo 
            System.out.println("Escritura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
        }
    }

    //public boolean actualizar(Pregunta p);
    //public boolean eliminar(int id);
    public UserList getLista() {
        return lista;
    }

}
