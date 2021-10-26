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

    // instancia de las clases
    GestorES gestor = new GestorES();
    MultipleSelectionList listMS = new MultipleSelectionList();
    TrueOrFalseList listTF = new TrueOrFalseList();
    UniqueSelectionList listUS = new UniqueSelectionList();

    public void menuQuestions() {
        String option = "";

        while (option != "exit") {
            option = gestor.solicitarValorString("Welcome to the manteinance class."
                    + "\n\nType:\n(Create) to add a question.\n(Read) to read a question."
                    + "\n(Update) to update a question.\n(Delete) to delete a question."
                    + "\n(Exit) to exit the the program.");
            switch (option.toLowerCase()) {
            case "create":
                boolean loopType = true;
                while (loopType == true) {
                    int typeQuestion = gestor.solicitarValorEntero(
                            "Select the type of question you want to create(only use numbers from 1 to 3)"
                                    + "\n\n1) True or false.\n2) Unique Selection.\n3) Multiple Selection.");
                    switch (typeQuestion) {
                    case 1: {
                        boolean loopCategory = true;
                        while (loopCategory == true) {
                            String categoryQuestion = gestor.solicitarValorString(
                                    "Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                                            + "\nHistory.\nGeography.\nScience.\nOthers.");
                            if (categoryQuestion.toLowerCase().equals("art")
                                    || categoryQuestion.toLowerCase().equals("entertainment")
                                    || categoryQuestion.toLowerCase().equals("sports")
                                    || categoryQuestion.toLowerCase().equals("history")
                                    || categoryQuestion.toLowerCase().equals("geography")
                                    || categoryQuestion.toLowerCase().equals("science")
                                    || categoryQuestion.toLowerCase().equals("others")) {
                                loopCategory = false;
                                boolean loopQuestion = true;
                                while (loopQuestion == true) {

                                    String question = gestor
                                            .solicitarValorString("Type the question that you want to add...");

                                    if (question.length() <= 50 && question.length() >= 4) {

                                        loopQuestion = false;

                                        boolean loopAnswer = true;

                                        while (loopAnswer == true) {

                                            String answer = gestor.solicitarValorString(
                                                    "Type the answer to your question (True or False) ");

                                            if (answer.toLowerCase().equals("true")
                                                    || answer.toLowerCase().equals("false")) {
                                                loopAnswer = false;
                                                listTF.setTrueOrFalse(question, categoryQuestion, answer);
                                                loopType = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                gestor.mostrarMensaje(
                                        "The type of category that you choose is invalid please try again.");
                            }
                        }
                        break;
                    }
                    case 2: {
                        boolean loopCategory = true;
                        while (loopCategory == true) {
                            String categoryQuestion = gestor.solicitarValorString(
                                    "Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                                            + "\nHistory.\nGeography.\nScience.\nOthers.");
                            if (categoryQuestion.toLowerCase().equals("art")
                                    || categoryQuestion.toLowerCase().equals("entertainment")
                                    || categoryQuestion.toLowerCase().equals("sports")
                                    || categoryQuestion.toLowerCase().equals("history")
                                    || categoryQuestion.toLowerCase().equals("geography")
                                    || categoryQuestion.toLowerCase().equals("science")
                                    || categoryQuestion.toLowerCase().equals("others")) {
                                loopCategory = false;
                                boolean loopQuestion = true;
                                while (loopQuestion == true) {

                                    String question = gestor
                                            .solicitarValorString("Type the question that you want to add...");

                                    if (question.length() <= 50 && question.length() >= 4) {

                                        loopQuestion = false;

                                        boolean loopAnswer = true;

                                        while (loopAnswer == true) {

                                            String correctAnswer = gestor
                                                    .solicitarValorString("Type the correct answer to your question.");
                                            String firstIncorrectAnswer = gestor.solicitarValorString(
                                                    "Type the first incorrect answer to your question.");
                                            String secondIncorrectAnswer = gestor.solicitarValorString(
                                                    "Type the second incorrect answer to your question.");
                                            String thirdIncorrectAnswer = gestor.solicitarValorString(
                                                    "Type the third incorrect answer to your question.");
                                            listUS.setUniqueSelection(question, categoryQuestion, correctAnswer,
                                                    firstIncorrectAnswer, secondIncorrectAnswer, thirdIncorrectAnswer);
                                            loopAnswer = false;
                                            loopType = false;
                                        }

                                    }
                                }
                            } else {
                                gestor.mostrarMensaje(
                                        "The type of category that you choose is invalid please try again.");
                            }
                        }
                        break;
                    }
                    case 3: {
                        boolean loopCategory = true;
                        while (loopCategory == true) {
                            String categoryQuestion = gestor.solicitarValorString(
                                    "Select the category of your question:\n\nArt.\nEntertainment.\nSports."
                                            + "\nHistory.\nGeography.\nScience.\nOthers.");
                            if (categoryQuestion.toLowerCase().equals("art")
                                    || categoryQuestion.toLowerCase().equals("entertainment")
                                    || categoryQuestion.toLowerCase().equals("sports")
                                    || categoryQuestion.toLowerCase().equals("history")
                                    || categoryQuestion.toLowerCase().equals("geography")
                                    || categoryQuestion.toLowerCase().equals("science")
                                    || categoryQuestion.toLowerCase().equals("others")) {
                                loopCategory = false;
                                boolean loopQuestion = true;
                                while (loopQuestion == true) {

                                    String question = gestor
                                            .solicitarValorString("Type the question that you want to add...");

                                    if (question.length() <= 50 && question.length() >= 4) {

                                        loopQuestion = false;

                                        boolean loopAnswer = true;

                                        while (loopAnswer == true) {

                                            String answer1 = gestor
                                                    .solicitarValorString("Type the correct answer to your question.");
                                            int correctAnswer1 = gestor.preguntaSiNo("Esta pregunta es correcta?");
                                            String answer2 = gestor.solicitarValorString(
                                                    "Type the first incorrect answer to your question.");
                                            int correctAnswer2 = gestor.preguntaSiNo("Esta pregunta es correcta?");
                                            String answer3 = gestor.solicitarValorString(
                                                    "Type the second incorrect answer to your question.");
                                            int correctAnswer3 = gestor.preguntaSiNo("Esta pregunta es correcta?");
                                            String answer4 = gestor.solicitarValorString(
                                                    "Type the third incorrect answer to your question.");
                                            int correctAnswer4 = gestor.preguntaSiNo("Esta pregunta es correcta?");

                                            listMS.setMultipleSelection(question, categoryQuestion, answer1, answer2,
                                                    answer3, answer4, correctAnswer1, correctAnswer2, correctAnswer3,
                                                    correctAnswer4);
                                            loopAnswer = false;
                                            loopType = false;
                                        }

                                    }
                                }
                            } else {
                                gestor.mostrarMensaje(
                                        "The type of category that you choose is invalid please try again.");
                            }
                        }
                        break;
                    }
                    }
                }
                break;
            case "read":
                boolean loopRead = true;
                while (loopRead) {
                    int typeQuestion = gestor.solicitarValorEntero(
                            "Select the type of your question\n1) True or false.\n2) Unique Selection.\n3) Multiple Selection.");
                    switch (typeQuestion) {
                    case 1:
                        int optionQuestion = gestor
                                .solicitarValorEntero("The existent questions in true or false are:\n"
                                        + listTF.getQuestions() + "\n\nSelect the question that you want to read");
                        gestor.mostrarMensaje("The question is:\n" + listTF.getSpecificQuestion(optionQuestion)
                                + "\nAnd the answer is: " + listTF.getSpecificAnswer(optionQuestion));
                        break;
                    case 2:
                        optionQuestion = gestor.solicitarValorEntero("The existent questions in unique selection are:\n"
                                + listUS.getQuestions() + "\n\nSelect the question that you want to read");
                        gestor.mostrarMensaje("The question is:\n" + listUS.getSpecificQuestion(optionQuestion)
                                + "\nAnd the answer is: " + listUS.getSpecificAnswer(optionQuestion));
                        break;
                    case 3:
                        optionQuestion = gestor
                                .solicitarValorEntero("The existent questions in multiple selection are:\n"
                                        + listMS.getQuestions() + "\n\nSelect the question that you want to read");
                        gestor.mostrarMensaje("The question is:\n" + listMS.getSpecificQuestion(optionQuestion)
                                + "\nAnd the answer is: " + listMS.getSpecificAnswer(optionQuestion));
                        break;
                    default:
                        gestor.mostrarMensaje("The type of question is incorrect please try an option from 1 to 3");
                        break;
                    }
                }
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