package modelos;

/**
 * Nodo cliente.
 */
public class Cliente {

    public String ID;          // ID del cliente.    
    public Cliente rLink;      // Enlace derecho.
    public Cliente lLink;      // Enlace izquierdo.

    /**
     * Constructor de Cliente.
     *
     * @param ID Identificación del cliente.
     */
    public Cliente(String ID) {
        this.ID = ID;        
    }    
}
