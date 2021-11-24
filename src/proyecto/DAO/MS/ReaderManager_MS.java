package proyecto.DAO.MS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import proyecto.ClasePrueba;
import proyecto.Lists.MultipleSelectionList;
import proyecto.sampleClasses.MultipleSelection;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class ReaderManager_MS {

    private BufferedReader reader;
    MultipleSelectionList lista = ClasePrueba.lista_MultipleSelectionList; // atributo statico de la lista de preguntas

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public MultipleSelection read() throws IOException {
        MultipleSelection p = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            p = new MultipleSelection();
            datos = line.split("-"); // separa el String en un array
            p.setQuestion(datos[0]); // lee el enunciado
            p.getmS_AnswerList().setMS_Answers(datos[1], Boolean.parseBoolean(datos[2]));
            p.getmS_AnswerList().setMS_Answers(datos[3], Boolean.parseBoolean(datos[4]));
            p.getmS_AnswerList().setMS_Answers(datos[5], Boolean.parseBoolean(datos[6]));
            p.getmS_AnswerList().setMS_Answers(datos[7], Boolean.parseBoolean(datos[8]));
            
        }
        return p;
    }

    public void readAll() throws IOException {
        MultipleSelection p;
        while ((p = read()) != null) {
            lista.agregar(p);
        }
    }
    public void close() throws IOException {
        reader.close();
    }
}
