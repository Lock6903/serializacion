
package com.ramos.serializacion.nativa;

import com.ramos.serializacion.model.Product;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author javierrampob
 */
public class Ejemplo1 {

    public static void main(String[] args) {

        Product prod = new Product(1, "string", 23);
        System.out.println(prod.toString());
        System.out.println("Vamos a serializar el producto anterior");
        serializar(prod);
//        Product newProd = null;
//        newProd = serializar();
//        System.out.println(newProd.toString());

    }
//    
//    static void deserializar(Product p) {
//
//        FileOutputStream fileIn = null;
//
//        try {
//
//            fileIn = new FileOutputStream(".\\Product.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileIn);
//            out.writeObject(p);
//            System.out.println("Vamos a serializar  elproducto anterior");
//
//        } catch (FileNotFoundException ex) {
//
//            System.out.println("No se encuentra la ruta del fichero. " + ex.getMessage());
//
//        } catch (IOException ex) {
//
//            System.out.println("Ha surgido un error serializando. " + ex.getMessage());
//
//        } finally {
//
//            try {
//                fileIn.close();
//
//            } catch (IOException ex) {
//
//                System.out.println("Ha surgido un error cerrando el fichero. " + ex.getMessage());
//            }
//
//        }
//
//    }
//    
//    ----------------------------------------

    static void serializar(Product p) {

        FileOutputStream fileOut = null;

        try {

            fileOut = new FileOutputStream(".\\Product.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
            System.out.println("Hemos serializado en el fichero Product.ser");

        } catch (FileNotFoundException ex) {

            System.out.println("No se encuentra la ruta del fichero. " + ex.getMessage());

        } catch (IOException ex) {

            System.out.println("Ha surgido un error serializando. " + ex.getMessage());

        } finally {

            try {
                fileOut.close();

            } catch (IOException ex) {

                System.out.println("Ha surgido un error cerrando el fichero. " + ex.getMessage());
            }

        }

    }
}
