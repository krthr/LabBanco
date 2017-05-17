package labbanco;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelos.Caja;
import modelos.Cliente;
import vistas.*;

public class LabBanco {

    public static Caja ptrCaja;        // Primer elemento de la lista de cajas.

    /**
     *
     * @return
     */
    public static Caja getPtrCaja() {
        return ptrCaja;
    }

    /**
     *
     * @param args
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        vistaPrincipal vista = new vistaPrincipal();
        vista.setVisible(true);
    }

    /**
     * Eliminar una caja dado su identificador. Para eliminarla se debe revisar
     * que no tenga clientes por atender.
     *
     * @param ID Identificador de la caja a eliminar.
     */
    static public void eliminarCaja(String ID) {
        Caja temp = ptrCaja.getLink();
        Caja ant = ptrCaja;
    }

    /**
     * Agregar caja nueva caja a la lista de cajas. Si el ID ya existe no se
     * agrega.
     *
     * @param who La ventana que llamó al método.
     * @param ID ID de la nueva caja.
     * @param tipoTrans Tipo de transacción que atenderá la caja.
     * @param cantDinero Cantidad de dinero inicial.
     */
    static public void agregarCaja(JFrame who, String ID, String tipoTrans, long cantDinero) {
        Caja nuevaCaja = new Caja(ID, cantDinero, tipoTrans);

        if (buscarCaja(ID) == null) {
            if (ptrCaja == null) ptrCaja = nuevaCaja;
            else {
                Caja temp = ptrCaja.getLink();
                Caja ant = ptrCaja;
                while (temp != null) {
                    ant = temp;
                    temp = temp.getLink();
                }

                if (temp == null) ant.setLink(nuevaCaja);
            }
        } else
            showError(who, "ERROR", "Ya existe una caja con el mismo código: " + ID);
    }

    /**
     * Agregar cliente. Se agregará a la caja con menos clientes por atender.
     *
     * @param ventana
     * @param ID ID del cliente.
     * @param tipoTrans Tipo de transacción que hará el cliente.
     */
    static public void agregarCliente(JFrame ventana, String ID, String tipoTrans) {
        Caja menClientes = null;
        Caja temp = ptrCaja;
        
        while (temp != null) {
            if (temp.getTipoTrans().equals(tipoTrans) && menClientes == null)
                menClientes = temp;
            else {
                if (temp.getTipoTrans().equals(tipoTrans) && temp.contarClientes() < menClientes.contarClientes())
                    menClientes = temp;
            }
            temp = temp.getLink();
        }
        
        if (menClientes != null) {
            menClientes.agregarCliente(new Cliente(ID, tipoTrans));
            showError(ventana, "¡Éxito!", "Cliente agregado con éxito. Caja: " + menClientes.getID());
        } else
            showError(ventana, "ERROR", "No hay cajas disponibles con tidpo de transacción: " + tipoTrans);
    }

    /**
     * Mostrar ventana de error.
     *
     * @param Ventana Ventana que llama al método.
     * @param title Título del error.
     * @param message Mensaje del error.
     */
    static public void showError(JFrame Ventana, String title, String message) {
        showMessageDialog(Ventana, message, title, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Mostrar ventana de información.
     *
     * @param Ventana Ventana que llama al método.
     * @param message Mensaje de la información.
     */
    static public void showMessage(JFrame Ventana, String message) {
        showMessageDialog(Ventana, message, "¡Éxito!", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Actualizar tabla de Cajas.
     *
     * @param table
     */
    public static void updateCajaTable(JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setRowCount(0);

        Caja temp = ptrCaja;
        while (temp != null) {
            modelo.addRow(new Object[]{
                temp.getID(),
                temp.getCantDinero(),
                temp.getTipoTrans()
            });

            temp = temp.getLink();
        }

    }

    /**
     * Buscar caja de acuerdo a  un ID dado.
     * @param ID
     * @return true: si existe. false: si no existe.
     */
    static Caja buscarCaja(String ID) {
        Caja temp = ptrCaja;
        while (temp != null) {
            if (temp.getID().equals(ID)) return temp;
            temp = temp.getLink();
        }
        return null;
    }
}
