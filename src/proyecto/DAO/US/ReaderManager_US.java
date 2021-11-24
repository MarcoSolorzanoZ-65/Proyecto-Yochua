package proyecto.DAO.US;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import proyecto.ClasePrueba;
import proyecto.Lists.UniqueSelectionList;
import proyecto.sampleClasses.TrueOrFalse;
import proyecto.sampleClasses.UniqueSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class ReaderManager_US {

    private BufferedReader reader;
    UniqueSelectionList lista = ClasePrueba.lista_UniqueSelectionList; // atributo statico de la lista de preguntas

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public UniqueSelection read() throws IOException {
        UniqueSelection p = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            p = new UniqueSelection();
            datos = line.split("-"); // separa el String en un array
            p.setQuestion(datos[0]); // lee el enunciado
            p.setAnswer((datos[1]));
            p.setIncAnswer1(datos[1]);
            p.setIncAnswer1(datos[2]);
            p.setIncAnswer1(datos[3]);// lee la respuesta
        }
        return p;
    }

    public void readAll() throws IOException {
        UniqueSelection p;
        while ((p = read()) != null) {
            lista.agregar(p);
        }
    }
    public void close() throws IOException {
        reader.close();
    }
}
