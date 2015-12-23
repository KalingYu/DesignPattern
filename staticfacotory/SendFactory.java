package staticfacotory;

/**
 * Created by kaling on 15/8/11.
 */
public class SendFactory {
    public Sender produceMailSender(){
        return new MailSender();
    }

    public Sender produceSmsSender(){
        return new SmsSender();
    }

}
