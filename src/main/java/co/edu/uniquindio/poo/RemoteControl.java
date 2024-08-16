package co.edu.uniquindio.poo;
public class RemoteControl {

    private static RemoteControl controlUnico;
    private RemoteControl(){

    }
    public static RemoteControl getInstance(){
        if (controlUnico == null){
            controlUnico = new RemoteControl();
        }
        return controlUnico;
    }
    public void ChangeChannel(int channel){
        System.out.println("Cambiando el canal" +  channel);


    }
    public void increaseVolume(){
        System.out.println("Incrementando VOlumen");
    }

}
