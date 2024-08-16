package co.edu.uniquindio.poo;

public class Sms implements INotificacion{

    @Override
    public void send_notificacion() {
        System.out.println("Enviando notificacion de SMS");
    }
    
}
