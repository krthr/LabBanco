package modelos;

/**
 * Nodo caja.
 */
public class Caja {

    public String ID;          // ID de la caja.
    public long cantDinero;    // Cantidad de dinero inicial de la caja.
    public long cantDineroActual; //Cantidad de dinero actual de la caja
    public int clientesAtendidos; //Clientes atendidos por la caja
    public String tipoTrans;   // Tipo de transacción que se hará en la caja.
    public Caja link;          // Enlace de la caja.
    public Cliente ptrCliente; // PTR de la lista de clientes de la caja.

    /**
     * Constructor de Caja.
     *
     * @param ID ID de la caja.
     * @param cantDinero Cantidad de dinero inicial de la caja.
     * @param tipoTrans Tipo de transacción que se efectuará en la caja.
     */
    public Caja(String ID, long cantDinero, String tipoTrans) {
        this.ID = ID;
        this.cantDinero = cantDinero;
        this.tipoTrans = tipoTrans;
        this.cantDineroActual = cantDinero;
        this.clientesAtendidos = 0;
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

        while (temp != null) {
            n++;
            temp = temp.rLink;
        }

        return n;
    }

    /**
     * Agregar cliente a la Caja.
     *
     * @param Cliente Cliente que se agregará a la caja.
     */
    public void agregarCliente(Cliente Cliente) {
        if (this.ptrCliente == null) {
            this.ptrCliente = Cliente;
            this.ptrCliente.rLink = null;
            this.ptrCliente.lLink = null;
        } else {
            Cliente p = this.ptrCliente;

            while (p.rLink != null) {
                p = p.rLink;
            }
            p.rLink = Cliente;
            Cliente.lLink = p;
        }
    }
}
