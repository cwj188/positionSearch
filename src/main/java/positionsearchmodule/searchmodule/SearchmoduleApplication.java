package positionsearchmodule.searchmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
public class SearchmoduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchmoduleApplication.class, args);
    }

}
