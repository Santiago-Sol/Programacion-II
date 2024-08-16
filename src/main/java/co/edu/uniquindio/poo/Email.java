package co.edu.uniquindio.poo;

public class Email implements INotificacion {

    @Override
    public void send_notificacion() {
        System.out.println("Enviando notificacion de Email");
    }
    
}
