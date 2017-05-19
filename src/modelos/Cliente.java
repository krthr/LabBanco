package modelos;

/**
 * Nodo cliente.
 */
public class Cliente {

    public String ID;          // ID del cliente.
    public String tipoTrans;   // Tipo de transacción que hará el cliente.
    public Cliente rLink;      // Enlace derecho.
    public Cliente lLink;      // Enlace izquierdo.

    /**
     * Constructor de Cliente.
     *
     * @param ID Identificación del cliente.
     * @param tipoTrans Tipo de transacción que efectuará.
     */
    public Cliente(String ID, String tipoTrans) {
        this.ID = ID;
        this.tipoTrans = tipoTrans;
    }

    public String getID() {
        return ID;
    }

    public String getTipoTrans() {
        return tipoTrans;
    }

    public Cliente getrLink() {
        return rLink;
    }

    public Cliente getlLink() {
        return lLink;
    }

}
