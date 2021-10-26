package proyecto;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-26
 * @time 8:16:23
 */
import javax.swing.JOptionPane;

public class GestorES {

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int solicitarValorEntero(String message) {
        return Integer.parseInt(solicitarValorString(message));
    }

    public String solicitarValorString(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public double solicitarValorDouble(String message) {
        return Double.parseDouble(solicitarValorString(message));
    }

    public boolean solicitarBooleano(String message) {
        int option = solicitarValorEntero(message);
        return option == 1;
    }

    public char solicitarValorChar(String message) {
        return solicitarValorString(message).charAt(0);
    }

    public int preguntaSiNo(String message) {
        return JOptionPane.showConfirmDialog(null, message, "INFORMATION", JOptionPane.YES_NO_OPTION);
    }
}
