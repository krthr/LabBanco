package modelos;

public class Cliente {
    private String ID; // ID del cliente
    private String tipoTrans; // Tipo de transacción que hará el cliente
    private Cliente rLink; // Enlace derecho
    private Cliente lLink; // Enlace izquierdo

    public Cliente(String ID, String tipoTrans) {
        this.ID = ID;
        this.tipoTrans = tipoTrans;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTipoTrans(String tipoTrans) {
        this.tipoTrans = tipoTrans;
    }
    
    public Cliente getrLink() {
        return rLink;
    }

    public void setrLink(Cliente rLink) {
        this.rLink = rLink;
    }

    public Cliente getlLink() {
        return lLink;
    }

    public void setlLink(Cliente lLink) {
        this.lLink = lLink;
    }

    public String getID() {
        return ID;
    }

    public String getTipoTrans() {
        return tipoTrans;
    }
    
}
