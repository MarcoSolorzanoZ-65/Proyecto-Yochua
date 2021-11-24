package proyecto.DAO.US;

import java.io.IOException;
import proyecto.sampleClasses.UniqueSelection;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.ClasePrueba;
import proyecto.Lists.UniqueSelectionList;
/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Dao_US {
    UniqueSelectionList lista = ClasePrueba.lista_UniqueSelectionList; // atributo statico de la lista de preguntas
    WriterManager_US writer = new WriterManager_US();
    ReaderManager_US reader = new ReaderManager_US();
    
    public static final String FILE_NAME = "preguntasUSFile.txt";

       
    public boolean insertar(UniqueSelection p){
        lista.agregar(p);
        guardarLista(p);
        return true;
    }

    public UniqueSelection generarPreguntaRandom(){
        UniqueSelection p = lista.getElemento();
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

    public void guardarLista(UniqueSelection p){ // se agregar datos de prueba            
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