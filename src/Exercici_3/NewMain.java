
package Exercici_3;


public class NewMain {


    public static void main(String[] args)throws NumParametresException, DoubleException, SegonParametreException {
        try {
            if (args.length != 2) {
                throw new NumParametresException("Han d'arribar dos parametres!!");
            }
            double num1, num2;
            try {
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                throw new DoubleException("Error en el format dels parametres, han de ser Double");
            }
            if(num2 == 0){
                throw new SegonParametreException("El segon parametre no pot ser 0");
            }
            System.out.println("Primer parametre: " + num1 + ", Segon parametre: " + num2);
        } catch (NumParametresException e) {
            System.err.println(e);
        } catch (DoubleException ex){
            System.err.println(ex);
        } catch (SegonParametreException exs){
            System.err.println(exs);
        }

    }
    
}
