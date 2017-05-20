package labbanco;

import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import modelos.*;
import vistas.*;

public class LabBanco {

    public static Caja ptrCaja;        // Primer elemento de la lista de cajas.    

    /**
     * Obtener el primer elemento de la lista de Cajas.
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
     * @param ventana
     * @param ID Identificador de la caja a eliminar.
     */
    static public void eliminarCaja(JFrame ventana, String ID) {
        Caja ant = null;
        Caja temp = ptrCaja;

        if (buscarCaja(ID) != null) {
            while (temp != null && temp.ID.equals(ID) == false) {
                ant = temp;
                temp = temp.link;
            }

            if (temp != null) {//Si temp no es nulo es porque encontró la caja
                if (temp == ptrCaja) {
                    ptrCaja = ptrCaja.link;
                } else {
                    ant.link = temp.link;
                }
                temp.link = null;
                showMessage(ventana, "Caja " + ID + " eliminada correctamente.");
            }
        } else {
            showError(ventana, "ERROR", "No existe la caja con el ID: " + ID);
        }
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
            if (ptrCaja == null) {
                ptrCaja = nuevaCaja;
            } else {
                Caja temp = ptrCaja;
                while (temp.link != null) {
                    temp = temp.link;
                }

                temp.link = nuevaCaja;
            }

            // updateCajaTable(vistaPrincipal.cajasTable);
        } else {
            showError(who, "ERROR", "Ya existe una caja con el mismo código: " + ID);
        }
    }

    /**
     * Agregar cliente. Se agregará a la caja con menos clientes por atender.
     *
     * @param ventana
     * @param ID ID del cliente.
     * @param tipoTrans Tipo de transacción que hará el cliente.
     */
    // TODO Verificar que el cliente no exista
    static public void agregarCliente(JFrame ventana, String ID, String tipoTrans) {
        Caja menClientes = null;
        Caja temp = ptrCaja;

        while (temp != null) {
            if (temp.tipoTrans.equals(tipoTrans) && menClientes == null) {
                menClientes = temp;
            } else if (temp.tipoTrans.equals(tipoTrans) && temp.contarClientes() < menClientes.contarClientes()) {
                menClientes = temp;
            }
            temp = temp.link;
        }

        if (menClientes != null) {
            temp = ptrCaja;
            Cliente q;
            while (temp != null) {
                q = temp.ptrCliente;
                while (q != null && q.ID.equals(ID) == false) {
                    q = q.rLink;
                }
                if (q != null) {
                    break;
                }
                temp = temp.link;
            }

            if (temp == null) {
                menClientes.agregarCliente(new Cliente(ID));
                showMessage(ventana, "Cliente agregado con éxito. Caja: " + menClientes.ID);
            } else {
                showMessage(ventana, "El ID ingresado pertenece a otro cliente.");
            }
        } else {
            showError(ventana, "ERROR", "No hay cajas disponibles con tipo de transacción: " + tipoTrans);
        }
    }

    /**
     * Despachar Cliente
     *
     * @param idCaja Es el id de la caja en la que se va a despachar el cliente
     */
    static public void despacharCliente(String idCaja, long monto) {
        Caja p = ptrCaja;
        int op = 1; //Cancelar 1, Aceptar 0

        while (p != null && p.ID.equals(idCaja) == false) {
            p = p.link;
        }

        if (p != null) {
            Cliente r = p.ptrCliente;
            if (r != null) {
                switch (p.tipoTrans) {
                    case "CONSIGNACIÓN":
                        p.cantDineroActual += monto;
                        p.clientesAtendidos++;
                        break;
                    case "RETIRO":
                        if (p.cantDineroActual >= monto) {
                            p.cantDineroActual -= monto;
                            p.clientesAtendidos++;
                        } else {
                            showMessage(null, "No hay montos suficientes para realizar retiro.");
                            op = JOptionPane.showConfirmDialog(null, "Intentar con otro monto?");
                            if(op == 1){
                                p.clientesAtendidos++;
                            }
                        }
                        break;
                    case "PAGO DE SERVICIOS":
                        p.cantDineroActual += monto;
                        p.clientesAtendidos++;
                        break;
                }
                if (op == 1) {// //Cancelar 1, Aceptar 0
                    p.ptrCliente = p.ptrCliente.rLink;
                    if (r.rLink != null) {
                        p.ptrCliente.lLink = null;
                    }else{
                        p.ptrCliente = null;
                    }

                    r.lLink = null;
                    r.rLink = null;
                    updateClienteList(vistaPrincipal.clientesLista, idCaja);
                    updateCajaTable(vistaPrincipal.cajasTable);
                }
            } else {
                System.out.println("No hay clientes almacenados");
            }
        }
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
     * Actualizar un jlist de clientes
     *
     * @param list Es la JList donde seran cargados los clientes
     * @param ID Es ID de la caja que tiene los clientes que seran cargados
     */
    public static void updateClienteList(JList list, String ID) {
        Caja q = ptrCaja;
        while (q != null && q.ID.equals(ID) == false) {
            q = q.link;
        }

        if (q != null) {
            DefaultListModel model = new DefaultListModel();
            list.setModel(model);
            Cliente p = q.ptrCliente;
            while (p != null) {
                model.addElement(p.ID);
                p = p.rLink;
            }
        }
    }

    /**
     * Actualizar tabla de Cajas.
     *
     * @param table Tabla donde se muestran la cajas.
     */
    public static void updateCajaTable(JTable table) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(modelo);

        modelo.addColumn("ID");
        modelo.addColumn("Cant. Dinero");
        modelo.addColumn("Tipo Transacc.");

        Caja temp = ptrCaja;
        while (temp != null) {
            modelo.addRow(new Object[]{
                temp.ID,
                temp.cantDineroActual,
                temp.tipoTrans
            });

            temp = temp.link;
        }
    }

    /**
     * Actualizar tabla de Estadisticas.
     *
     * @param table Tabla donde se muestran las estadisticas.
     */
    public static void generarEstadisticas(JTable table) {
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("D. Inicial");
        modelo.addColumn("D. Actual");
        modelo.addColumn("C. Atendidos");
        modelo.addColumn("C. Restantes");
        modelo.addColumn("Tipo T.");

        Caja temp = ptrCaja;
        while (temp != null) {
            modelo.addRow(new Object[]{
                temp.ID,
                temp.cantDinero,
                temp.cantDineroActual,
                temp.clientesAtendidos,
                temp.contarClientes(),
                temp.tipoTrans
            });

            temp = temp.link;
        }
    }

    /**
     * Buscar caja de acuerdo a un ID dado.
     *
     * @param ID
     * @return Si la caja fue encontrada devolverá la caja. Si no, retornará
     * nulo.
     */
    static Caja buscarCaja(String ID) {
        Caja temp = ptrCaja;
        while (temp != null) {
            if (temp.ID.equals(ID)) {
                return temp;
            }

            temp = temp.link;
        }
        return null;
    }

    /**
     * Ver ventana con información de una caja.
     *
     * @param ventana Ventana principal
     * @param ventanaCaja Ventana con la información de la caja.
     * @param ID ID de la caja que se mostrará.
     */
    public static void viewCaja(JFrame ventana, JFrame ventanaCaja, String ID) {
        Caja temp = buscarCaja(ID); // Obtener la caja que se desea mostrar

        // Actualizar los textos de la ventana con la información de la caja
        vistaPrincipal.setTextVentanaCaja(temp.ID, temp.tipoTrans);
        ventanaCaja.setLocationRelativeTo(null);
        // Abrir ventana de Caja y cerrar la principal
        ventana.setVisible(false);
        ventanaCaja.setVisible(true);
    }

    /**
     * Función que se ejecuta cuando se presiona el botón "Atrás".
     *
     * @param main Ventana que será mostrada (a la que se volverá)
     * @param back Ventana que se cerrará
     */
    public static void volverAtrás(JFrame main, JFrame back) {
        back.setVisible(false);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
}
