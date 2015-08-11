package demos.staticfacotory;
/**
 * Created by kaling on 15/8/11.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("send sms");
    }
}
