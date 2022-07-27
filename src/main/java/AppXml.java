import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Appxml.xml");
        MessagePrinter messagePrinter = (MessagePrinter) applicationContext.getBean("messagePrinter");
        messagePrinter.printMessage();
    }
}
