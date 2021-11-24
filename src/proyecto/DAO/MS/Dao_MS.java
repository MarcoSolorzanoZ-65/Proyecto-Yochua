package proyecto.DAO.MS;

import java.io.IOException;
import proyecto.sampleClasses.MultipleSelection;
import proyecto.ClasePrueba;
import proyecto.Lists.MultipleSelectionList;
/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Dao_MS {
    MultipleSelectionList lista = ClasePrueba.lista_MultipleSelectionList; // atributo statico de la lista de preguntas
    WriterManager_MS writer = new WriterManager_MS();
    ReaderManager_MS reader = new ReaderManager_MS();
    
    public static final String FILE_NAME = "preguntasMSFile.txt";

       
    public boolean insertar(MultipleSelection p){
        lista.agregar(p);
        guardarLista(p);
        return true;
    }

    public MultipleSelection generarPreguntaRandom(){
        MultipleSelection p = lista.getElemento();
        return p;
    }
    
    public void cargarDatosPrueba(){ // se agregar datos de prueba     
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

    public void guardarLista(MultipleSelection p){ // se agregar datos de prueba            
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
}
