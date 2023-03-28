package com.ramos.serializacion.nativa;

import com.ramos.serializacion.model.Product;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

        Product prodDeserializado = deserializar();
        System.out.println("Objeto deserializado: " + prodDeserializado);
    }

    public static Product deserializar() {
        Product prod = null;
        try {
            FileInputStream fileIn = new FileInputStream("producto.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            prod = (Product) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("La clase Product no ha sido encontrada.");
            c.printStackTrace();
        }
        return prod;
    }

//    ----------------------------------------
    public static void serializar(Product prod) {
        try {
            FileOutputStream fileOut = new FileOutputStream("producto.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(prod);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado y almacenado en 'producto.ser'");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
