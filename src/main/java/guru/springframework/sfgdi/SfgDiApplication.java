package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
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

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
	}
}