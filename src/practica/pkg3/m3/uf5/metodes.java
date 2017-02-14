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

    public String[] metode2(String text) {
        String[] cadena = new String[4];
        int cont = 0;

        for (int i = 0; i < cadena.length; i++) {
            while ((".").equals(text.charAt(cont))) {
                cadena[i] = cadena[i] + text.charAt(cont);
                cont ++;
            }
            cont++;
        }

        return cadena;
    }

    public boolean metode3(String IP) {
        boolean comprovacio = false;

        String[] cadenaIP;
        cadenaIP = metode2(IP);

        for (int i = 0; i < cadenaIP.length; i++) {
            comprovacio = metode1(cadenaIP[i], 0, 255);
        }

        return comprovacio;
    }
}
