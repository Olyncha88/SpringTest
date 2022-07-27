import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Autowired
    IMessageService iMessageService;
    @Bean("messageService")
    public IMessageService getMessageService() {
        return new IMessageService() {
            @Override
            public String getMessage() {
                return "Hello, Spring!";
            }
        };
    }
    @Bean("messagePrinter")
    public MessagePrinter getMessagePrinter() {
        return new MessagePrinter (iMessageService);
    }
}
