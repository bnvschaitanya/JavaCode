class phone{
    void call(){
        System.out.println("Call feature of phone");
    }
    void sms(){
        System.out.println("SMS feature of phone");
    }
}
interface ICamera {
    abstract void click();
    abstract void record();
}
interface IMusicPlayer {
    void play();
    void pause();
    void stop();
}
class SmartPhone extends phone implements ICamera, IMusicPlayer {
    SmartPhone() {
        System.out.println("SmartPhone constructor");
    }
    void call(){
        System.out.println("Call feature of SmartPhone");
    }
    void sms(){
        System.out.println("SMS feature of SmartPhone");
    }
    public void click(){
        System.out.println("Click feature of SmartPhone");
    }
    public void record(){
        System.out.println("Record feature of SmartPhone");
    }
    public void stop(){
        System.out.println("Stop feature of SmartPhone IMusicPlayer");
    }
    public void play(){
        System.out.println("Play feature of SmartPhone IMusicPlayer");
    }
    public void pause(){
        System.out.println("Pause feature of SmartPhone IMusicPlayer");
    }
}
public class Interfaces {
    public static void main(String args[]){
        System.out.println("Main Method");
        SmartPhone sm = new SmartPhone();
        sm.click();
        sm.record();
        phone p = sm;
        p.call();
        p.sms();
        ICamera c = sm;
        c.click();
        c.record();
        IMusicPlayer i = sm;
        i.play();
        i.pause();
        i.stop();
    }
}
