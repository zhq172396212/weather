import com.xt.service.HelloService;
import com.xt.service.Impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class StartService {
    public static void main(String[] args) {
        HelloService h = new HelloServiceImpl();
        Endpoint.publish("http://localhost:9999/javaws/getHello", h);
        System.out.println("发布服务成功");
    }
}
