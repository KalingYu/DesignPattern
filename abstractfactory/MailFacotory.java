package demos.abstractfactory;

/**
 * Created by kaling on 15/8/11.
 */
public class MailFacotory implements Factory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
