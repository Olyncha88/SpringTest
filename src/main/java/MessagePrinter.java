import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {
    private final IMessageService iMessageService;

    @Autowired
    public MessagePrinter(IMessageService iMessageService) {
        this.iMessageService = iMessageService;
    }

    public void printMessage(){
        System.out.println(iMessageService.getMessage());
    }
}
