package proxy;

/**
 * Created by kaling on 12/11/15.
 */
public class ProxyFactoryOriginal {
    private StudentBean stu;
    public StudentBean createStudentProxy(String name){
        return new StudentBean(name);
    }

    public StudentBean createStudentProxy(){
        return new StudentBean();
    }
}
