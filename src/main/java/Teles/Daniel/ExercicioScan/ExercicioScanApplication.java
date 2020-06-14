package Teles.Daniel.ExercicioScan;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dao")
public class ExercicioScanApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExercicioScanApplication.class, args);

		ClassDAO classDao = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto da classe ClassDAO " + classDao);
		System.out.println("Objeto da classe ClassJDBC " + classDao.getClassJDBC());
	}

}
