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
            switch (option.toLowerCase()) {
                case "create":
                    boolean loopType = true;
                    while (loopType == true) {
                        int typeQuestion = gestor.solicitarValorEntero("Select the type of question you want to create(only use numbers from 1 to 3)"
                                + "\n\n1) True or false.\n2) Unique Selection.\n3) Multiple Selection.");
                        switch (typeQuestion) {
                            case 1: {
                                boolean loopCategory = true;
                                while (loopCategory == true) {
                                    String categoryQuestion = gestor.solicitarValorString("Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                                            + "\nHistory.\nGeography.\nScience.\nOthers.");
                                    if (categoryQuestion.toLowerCase().equals("art") || categoryQuestion.toLowerCase().equals("entertainment")
                                            || categoryQuestion.toLowerCase().equals("sports") || categoryQuestion.toLowerCase().equals("history")
                                            || categoryQuestion.toLowerCase().equals("geography") || categoryQuestion.toLowerCase().equals("science")
                                            || categoryQuestion.toLowerCase().equals("others")) {
                                        loopCategory = false;
                                        boolean loopQuestion = true;
                                        while (loopQuestion == true) {

                                            String question = gestor.solicitarValorString("Type the question that you want to add...");

                                            if (question.length() <= 50 && question.length() >= 4) {

                                                loopQuestion = false;

                                                boolean loopAnswer = true;

                                                while (loopAnswer == true) {

                                                    String answer = gestor.solicitarValorString("Type the answer to your question (True or False) ");

                                                    if (answer.toLowerCase().equals("true") || answer.toLowerCase().equals("false")) {
                                                        loopAnswer = false;
                                                        listTF.setTrueOrFalse(question, categoryQuestion, answer);
                                                        loopType = false;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        gestor.mostrarMensaje("The type of category that you choose is invalid please try again.");
                                    }
                                }
                                break;
                            }
                            case 2: {
                                boolean loopCategory = true;
                                while (loopCategory == true) {
                                    String categoryQuestion = gestor.solicitarValorString("Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                                            + "\nHistory.\nGeography.\nScience.\nOthers.");
                                    if (categoryQuestion.toLowerCase().equals("art") || categoryQuestion.toLowerCase().equals("entertainment")
                                            || categoryQuestion.toLowerCase().equals("sports") || categoryQuestion.toLowerCase().equals("history")
                                            || categoryQuestion.toLowerCase().equals("geography") || categoryQuestion.toLowerCase().equals("science")
                                            || categoryQuestion.toLowerCase().equals("others")) {
                                        loopCategory = false;
                                        boolean loopQuestion = true;
                                        while (loopQuestion == true) {

                                            String question = gestor.solicitarValorString("Type the question that you want to add...");

                                            if (question.length() <= 50 && question.length() >= 4) {

                                                loopQuestion = false;

                                                boolean loopAnswer = true;

                                                while (loopAnswer == true) {

                                                    String correctAnswer = gestor.solicitarValorString("Type the correct answer to your question.");
                                                    String firstIncorrectAnswer = gestor.solicitarValorString("Type the first incorrect answer to your question.");
                                                    String secondIncorrectAnswer = gestor.solicitarValorString("Type the second incorrect answer to your question.");
                                                    String thirdIncorrectAnswer = gestor.solicitarValorString("Type the third incorrect answer to your question.");
                                                }
                                            }
                                        }
                                    } else {
                                        gestor.mostrarMensaje("The type of category that you choose is invalid please try again.");
                                    }
                                }
                                break;
                            }
                            case 3: {
                                String categoryQuestion = gestor.solicitarValorString("Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                                        + "\nHistory.\nGeography.\nScience.\nOthers.");
                                if (categoryQuestion.toLowerCase().equals("art") || categoryQuestion.toLowerCase().equals("entertainment")
                                        || categoryQuestion.toLowerCase().equals("sports") || categoryQuestion.toLowerCase().equals("history")
                                        || categoryQuestion.toLowerCase().equals("geography") || categoryQuestion.toLowerCase().equals("science")
                                        || categoryQuestion.toLowerCase().equals("others")) {
                                    String question = gestor.solicitarValorString("Type the question that you want to add...");
                                } else {
                                    gestor.mostrarMensaje("The type of category that you choose is invalid please try again.");
                                }
                                break;
                            }
                            default:
                                gestor.mostrarMensaje("Error: Ingrese una opcion valida.");
                                break;
                        }
                    }
                    break;
                case "read":
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                case "exit":
                    option = "exit";
                    break;
                default:
                    gestor.mostrarMensaje("Error: Ingrese una opcion valida.");
                    break;
            }
        }

    }

}
