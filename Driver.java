public class Driver {
    public static void main(String[] args) {
        Email email = new Email();
        File file = new File();        
        file.setTesto("giorgia scuro");
        String parolaChiave = "scuro"; 
        System.out.println(file.toString());
        boolean valore = contieneParolaChiave(file, parolaChiave);
        System.out.println(valore);
    }       
    public static boolean contieneParolaChiave(Documento oggettoDoc, String parolaChiave) {
        if (oggettoDoc.toString().indexOf(parolaChiave, 0) >= 0)
            return true;
        return false;
    }
}
         
        