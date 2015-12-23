package abstractfactory;


/**
 * Created by kaling on 15/8/11.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
