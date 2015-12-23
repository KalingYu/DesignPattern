package proxy;

/**
 * Created by kaling on 12/11/15.
 */
public class StudentBean implements StudentInterface {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentBean(){};

    public StudentBean(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("hello world");
    }
}