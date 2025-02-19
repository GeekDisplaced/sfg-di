package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.SfgConfiguration;
import guru.springframework.sfgdi.config.SfgConstructorConfig;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.lifecycle.PrototypeBean;
import guru.springframework.sfgdi.lifecycle.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("----------   Property Injection & Qualifier Annotation   ---------");

		InjectedByPropertyController propertyInjectedController = (InjectedByPropertyController) ctx.getBean("injectedByPropertyController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------    Setter Injection & Qualifier Annotation    ---------");

		InjectedBySetterController setterInjectedController = (InjectedBySetterController) ctx.getBean("injectedBySetterController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------- Constructor  Injection & Qualifier Annotation ---------");

		InjectedByConstructorController injectedByConstructorController = (InjectedByConstructorController) ctx.getBean("injectedByConstructorController");
		System.out.println(injectedByConstructorController.getGreeting());

		System.out.println("---------- Constructor Injection & Primary Annotation ---------");

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("---------- Constructor Injection & Profile Annotation ---------");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("---------- Constructor Injection & Default Annotation ---------");

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("---------- Bean Scoping Example ---------");

		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("---------- Externalised Properties via *.properties file ---------");

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcCurl());

		System.out.println("--------- Config Props Bean");
		SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());

		System.out.println("---------- Constuctor Binding");
		SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConstructorConfig.getUsername());
		System.out.println(sfgConstructorConfig.getPassword());
		System.out.println(sfgConstructorConfig.getJdbcurl());
	}
}
