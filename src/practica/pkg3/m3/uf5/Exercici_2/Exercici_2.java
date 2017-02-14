
package practica.pkg3.m3.uf5.Exercici_2;


public class Exercici_2 {
    /****************       A       *****************/
    
    
    /*
    
    // Bloc 1
        try {
            // Bloc 2
        } catch (Exception error) {
            // Bloc 3
        }
    // Bloc 4
    
    */
    
/*  Sense excepcions: Bloc 1 --> Bloc 2 --> Bloc 4
    Amb una excepció al bloc 2: Bloc 1 --> Bloc 2 (peta) --> Bloc 3 --> Bloc 4
    Amb una excepció al bloc 1:  Bloc 1 (peta)       */
    
    
/************************       B       **********************/
 /* // Bloc 1
        try {
            // Bloc 2
        } catch (ArithmeticException ae)) {
            // Bloc 3
        } catch (NullPointerException ne) {
            // Bloc 4
        }
    // Bloc 5
*/
    
    /*
    
    Sense excepcions: Bloc 1 --> Bloc 2 --> Bloc 5
    Amb excepció de tipus aritmètic: Bloc 1 --> Bloc 2 (peta) --> Bloc 3 --> Bloc 5
    Accés a un objecte nul: Bloc 1 --> Bloc 2 (peta) --> Bloc 4 --> Bloc 5
    Excepció d'un altre tipus diferent: Bloc 1 --> Bloc 2 (peta)
    
    */
    
    
    /**********************     C       ************************/
    
    /*
    
    // Bloc 1
        try {
            // Bloc 2
        } catch (ArithmeticException ae)) {
            // Bloc 3
        } catch (Exception e) {
            // Bloc 4
        }
    // Bloc 5
  
    */
    

    /*
    
    Sense excepcions: Bloc 1 --> Bloc 2 --> Bloc 5
    Amb excepció de tipus aritmètic: Bloc 1 --> Bloc 2 (peta) --> Bloc 3 --> Bloc 5
    Excepció d'un altre tipus diferent: Bloc 1 --> Bloc 2 (peta) --> Bloc 4 --> Bloc 5

    */    
    
    
    
    /*************************      D       *****************************/
    
    /*
    
    // Bloc 1
        try {
            // Bloc 2
        } catch (Exception e)) {
            // Bloc 3
        } catch (NullPointerException ne) {
            // Bloc 4
        }
    // Bloc 5
    
    */
    
    /*
    
    Sense excepcions: Bloc 1 --> Bloc 2 --> Bloc 5
    Amb excepció de tipus aritmètic: Bloc 1 --> Bloc 2 (peta)
    Excepció d'un altre tipus diferent: Bloc 1 --> Bloc 2 (peta) --> Bloc 3
    
    */
    
    /**************************         E           **************************/
    
    /*
    
    // Bloc 1
        try {
            // Bloc 2
        } catch (ArithmeticException e) {
            // Bloc 3
        } finally{
            // Bloc 4
        }
    // Bloc 5
    
    */
    
    /*
    
    Sense excepcions: Bloc 1 --> Bloc 2 --> Bloc 4 --> Bloc 5
    Amb excepció de tipus aritmètic: Bloc 1 --> Bloc 2 (peta) --> Bloc 3 --> Bloc 4 --> Bloc 5
    Excepció d'un altre tipus diferent: Bloc 1 --> Bloc 2 (peta) 

    
    */
    
    
    
    
}
