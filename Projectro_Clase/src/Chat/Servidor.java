package Chat;

import java.io.*;
import java.net.*;
import java.util.Observable;
import java.util.logging.*;

public class Servidor extends Observable implements Runnable {

    private int puerto;

    public Servidor() {
    }

    public Servidor(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;

        DataInputStream in;

        try {

            servidor = new ServerSocket(puerto);
            System.out.println("Servidor Iniciado");

            while (true) {

                sc = servidor.accept();
                System.out.println("Cliente Conectado");
                in = new DataInputStream(sc.getInputStream());

                String mensaje = in.readUTF();

                System.out.println(mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                sc.close();
                System.out.println("Cliente desconectado");
            }

        } catch (IOException e) {
            Logger.getLogger(servidor.getClass().getName()).log(Level.SEVERE, null, e);
        }
    }

}
