public class Email extends Documento {
    private String mittente;
    private String destinatario;
    private String titolo;
    public String toString() {
        return super.toString() + " " + mittente + " " + destinatario + " " + titolo;
    }
    public String getMittente() {
        return mittente;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setMittente(String mittente) {
        this.mittente = mittente;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
        

    