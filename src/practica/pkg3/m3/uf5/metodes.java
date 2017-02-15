package practica.pkg3.m3.uf5;

public class metodes {

    public boolean metode1(String text, int num1, int num2) {
        boolean comprovacio = false;

        try {
            int num = Integer.parseInt(text);
            if (num >= num1 && num <= num2) {
                comprovacio = true;
            } else {
                comprovacio = false;
            }

        } catch (Exception e) {
            System.out.println("No es numero");
        }

        return comprovacio;
    }

    public String[] metode2(String text) throws IPErroniaException {
        boolean comprovat;
        if (text == null) {
            throw new IPErroniaException("Una IP no pot estar buida");
        }
        String[] partes = text.split("\\.");
        if (partes.length != 4) {
            throw new IPErroniaException("Ha de contenir 4 blocs");
        }
        return partes;
    }

    public boolean metode3(String IP) throws IPErroniaException {
        boolean comprovacio = false;

        try {

            String[] cadenaIP;
            cadenaIP = metode2(IP);

            for (int i = 0; i < cadenaIP.length; i++) {
                comprovacio = metode1(cadenaIP[i], 0, 255);
                if (comprovacio == false) {
                    break;
                }
            }

        } catch (IPErroniaException ex) {

        }

        return comprovacio;
    }

}
