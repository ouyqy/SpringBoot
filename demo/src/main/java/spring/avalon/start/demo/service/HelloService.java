package spring.avalon.start.demo.service;

/**
 * @Author ouyqy
 * @Created 2017/11/9.
 */
public class HelloService {
    private String msg;

    public String sayHello(){
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
