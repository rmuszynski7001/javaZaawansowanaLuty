package sda.patterns.behavioral;

public abstract class NewsProvider {
    private String message;

    public abstract boolean authorize();

    private boolean sendMessage(){
        System.out.println("Wysyłanie wiadomości: " + message);
        return true;
    }
    public abstract boolean endConnection();

    public final void provideNews(){
        if(authorize()){
            sendMessage();
            endConnection();
        }
    }
    public void setMessage(String message){
        this.message = message;
    }
}
