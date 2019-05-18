package guru.springframework;

import guru.springframework.controllers.MyController;
import guru.springframework.propertyexamplebeans.FakeDataSource;
import guru.springframework.propertyexamplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"guru.springframework.services","guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getDburl());

        FakeJmsBroker fakeJmsBroker=(FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getJmsUsername());
        System.out.println(fakeJmsBroker.getJmsPassword());
        System.out.println(fakeJmsBroker.getJmsUrl());

		/*		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());*/
	}
}
