package proyecto.DAO.MS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import proyecto.ClasePrueba;
import proyecto.Lists.MultipleSelectionList;
import proyecto.sampleClasses.MultipleSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/

public class WriterManager_MS {
    private BufferedWriter writer;
    MultipleSelectionList lista = ClasePrueba.lista_MultipleSelectionList; // atributo statico de la lista de preguntas    

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(MultipleSelection p) throws IOException {
        writer.write(p.toString() + "\n");
    }
    
    public void writeAll() throws IOException {
        for (int i = 0; i < 3; i++) {
            MultipleSelection e = lista.getElemento(i);
            if (e != null){
                write(e);
            }           
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}
