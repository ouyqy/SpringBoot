package spring.avalon.start.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author ouyqy
 * @Created 2017/11/9.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG ="world";

//    private String msg = MSG;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
