package staticfacotory;

/**
 * Created by kaling on 15/8/11.
 */
public class MailSender implements staticfacotory.Sender {
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
