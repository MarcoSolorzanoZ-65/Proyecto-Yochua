package proyecto.DAO.US;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import proyecto.ClasePrueba;
import proyecto.Lists.UniqueSelectionList;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class WriterManager_US {

    private BufferedWriter writer;
    UniqueSelectionList lista = ClasePrueba.lista_UniqueSelectionList; // atributo statico de la lista de preguntas    

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(UniqueSelection p) throws IOException {
        writer.write(p.toString() + "\n");
    }

    public void writeAll() throws IOException {
        for (int i = 0; i < lista.getTAMANO(); i++) {
            UniqueSelection e = lista.getElemento(i);
            if (e != null) {
                write(e);
            }
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}
