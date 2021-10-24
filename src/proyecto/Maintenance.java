package proyecto;

import proyecto.Lists.MultipleSelectionList;
import proyecto.Lists.TrueOrFalseList;
import proyecto.Lists.UniqueSelectionList;

/**
 * @author Joshua Sancho Mora C17337
 * @time 1:55:48 PM
 * @date Oct 24, 2021
 */
public class Maintenance {

    GestorES gestor = new GestorES();
    MultipleSelectionList listMS = new MultipleSelectionList();
    TrueOrFalseList listTF = new TrueOrFalseList();
    UniqueSelectionList listUS = new UniqueSelectionList();

    public void menuQuestions() {
        String option = "";

        while (option != "exit") {
            option = gestor.solicitarValorString("Welcome to the manteinance class."
                    + "\n\nType:\n1) (Create) to add a question.\n2) (Read) to read a question."
                    + "\n3) (Update) to update a question.\n4) (Delete) to delete a question."
                    + "\n5) (Exit) to exit the the program.");
            option = option.toLowerCase();
            switch (option) {
                case "create":
                    int typeQuestion = gestor.solicitarValorEntero("Select the type of question you want to create(only use numbers from 1 to 3)"
                            + "\n\n1) True or false.\n2) Unique Selection.\n3) Multiple Selection.");
                    String categoryQuestion = gestor.solicitarValorString("Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                            + "\nHistory.\nGeography.\nScience.\nOthers.");
                    String question = gestor.solicitarValorString("Type the question that you want to add...");
                    break;
                case "read":
                    break;
                case "update":
                    break;
                case "delete":
                    break;
            }
        }

    }

}
