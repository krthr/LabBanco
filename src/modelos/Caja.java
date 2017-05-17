package modelos;

public class Caja {

    private String ID;          // ID de la caja.
    private long cantDinero;    // Cantidad de dinero inicial de la caja.
    private String tipoTrans;   // Tipo de transacción que se hará en la caja.
    private Caja link;          // Enlace de la caja.
    private Cliente ptrCliente; // PTR de la lista de clientes de la caja.

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
        Cliente temp = ptrCliente;
        int n = 0;

        while (temp.getrLink() != null) {
            n++;
            temp = temp.getrLink();
        }

        return n;
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
                ptrCliente.setrLink(null);
                ptrCliente.setlLink(null);
            } else {
                Cliente temp = ptrCliente;

                while (temp.getrLink() != null) {
                    temp = temp.getrLink();
                }

                if (temp.getrLink() == null) {
                    temp.setrLink(Cliente);
                    temp.getrLink().setlLink(temp);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Caja getLink() {
        return link;
    }

    public void setLink(Caja link) {
        this.link = link;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTipoTrans(String tipoTrans) {
        this.tipoTrans = tipoTrans;
    }

    public long getCantDinero() {
        return cantDinero;
    }

    public String getTipoTrans() {
        return tipoTrans;
    }

    public void setCantDinero(long cantDinero) {
        this.cantDinero = cantDinero;
    }

}
