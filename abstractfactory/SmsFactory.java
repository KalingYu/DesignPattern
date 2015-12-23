package demos.abstractfactory;

/**
 * Created by kaling on 15/8/11.
 */
public class SmsFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
