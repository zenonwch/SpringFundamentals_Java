import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(final String[] args) {

		final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//		final CustomerService service = ctx.getBean("service", CustomerService.class);
		final CustomerService service = ctx.getBean("customerService", CustomerService.class);
		System.out.println(service);
		final CustomerService service2 = ctx.getBean("customerService", CustomerService.class);
		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstName());
	}
}
