package proyecto.DAO;

import java.io.IOException;
import proyecto.Lists.TrueOrFalseList;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.ClasePrueba;
/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Dao_TF {
    TrueOrFalseList lista = ClasePrueba.lista; // atributo statico de la lista de preguntas
    WriterManager writer = new WriterManager();
    ReaderManager reader = new ReaderManager();
    
    public static final String FILE_NAME = "preguntaFile.txt";

       
    public boolean insertar(TrueOrFalse p){
        lista.agregar(p);
        guardarLista(p);
        return true;
    }

    public TrueOrFalse generarPreguntaRandom(){
        TrueOrFalse p = lista.getElemento();
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

    public void guardarLista(TrueOrFalse p){ // se agregar datos de prueba            
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
