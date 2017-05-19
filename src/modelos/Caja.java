package modelos;

public class Caja {

    public String ID;          // ID de la caja.
    public long cantDinero;    // Cantidad de dinero inicial de la caja.
    public String tipoTrans;   // Tipo de transacción que se hará en la caja.
    public Caja link;          // Enlace de la caja.
    public Cliente ptrCliente; // PTR de la lista de clientes de la caja.

    /**
     *
     * @param ID
     * @param cantDinero
     * @param tipoTrans
     */
    public Caja(String ID, long cantDinero, String tipoTrans) {
        this.ID = ID;
        this.cantDinero = cantDinero;
        this.tipoTrans = tipoTrans;
    }

    /**
     * Contar el número de clientes que están en la lista de clientes (falta por
     * atender).
     *
     * @return El número de clientes en la caja.
     */
    public int contarClientes() {
        try {
            Cliente temp = ptrCliente;
            int n = 0;

            while (temp.rLink != null) {
                n++;
                temp = temp.rLink;
            }

            return n;
        } catch (Exception e) {
            return 0;
        }
    }

    public Cliente PtrCliente() {
        return ptrCliente;
    }

    /**
     * Agregar cliente a la Caja.
     *
     * @param Cliente Cliente que se agregará a la caja.
     * @return true: si se agregó correctamente. false: si ocurrió algún error.
     */
    public boolean agregarCliente(Cliente Cliente) {
        try {
            if (ptrCliente == null) {
                ptrCliente = Cliente;
                ptrCliente.rLink = null;
                ptrCliente.lLink = null;
            } else {
                Cliente temp = ptrCliente;

                while (temp.rLink != null) {
                    temp = temp.rLink;
                }

                if (temp.rLink == null) {
                    temp.rLink = Cliente;
                    temp.rLink.lLink = temp;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Caja Link() {
        return link;
    }

    public String ID() {
        return ID;
    }
    public long CantDinero() {
        return cantDinero;
    }

    public String TipoTrans() {
        return tipoTrans;
    }
}
