package co.edu.uniquindio.poo;

public class NotificacionFactory {

    public INotificacion getNotificacion(String type){
    type = type.toLowerCase();
    switch (type) {
        case "Email":
            return new Email();
        case "sms":
            return new Sms();
        default:
            System.out.println("No es ningun de los casos");
            return null;
        }

    }
}


    

