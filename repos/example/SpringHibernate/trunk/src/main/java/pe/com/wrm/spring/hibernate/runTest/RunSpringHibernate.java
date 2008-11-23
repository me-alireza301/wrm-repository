package pe.com.wrm.spring.hibernate.runTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import pe.com.wrm.spring.hibernate.dao.DepartamentoDao;
import pe.com.wrm.spring.hibernate.domain.Departamento;

public class RunSpringHibernate {

	public static void main(String[] args) {
		System.out.println("Iniciando Pruebas");
		Resource resource = new FileSystemResource(
				"./src/main/java/applicationContext.xml");

		BeanFactory factory = new XmlBeanFactory(resource);
		Departamento departamento = new Departamento();
		departamento.setId(1);
		departamento.setDescripcion("Ventas");
		departamento.setEstado("A");
		DepartamentoDao departamentoDao = (DepartamentoDao)factory.getBean("departamentoDao");
		departamentoDao.save(departamento);
		System.out.println("Se grabo el registro 1");
		
		/*departamento = new Departamento();
		departamento.setId(2);
		departamento.setDescripcion("Marketing");
		departamento.setEstado("A");
		System.out.println("Se grabo el registro 2");*/
		
	}

}
