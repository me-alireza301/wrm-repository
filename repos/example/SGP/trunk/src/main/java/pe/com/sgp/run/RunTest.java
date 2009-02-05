package pe.com.sgp.run;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import pe.com.sgp.domain.Articulo;
import pe.com.sgp.service.ArticuloService;

public class RunTest {

	public static void main(String[] args) {
		 /*ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");*/
		System.out.println("Iniciando Pruebas");
		
		String pathFile = "./src/main/java/pe/com/sgp/config/SpringApplicationContext.xml";
		Resource resource = new FileSystemResource(pathFile);

		BeanFactory factory = new XmlBeanFactory(resource);
		
		 Articulo articulo = new Articulo();
		 articulo.setDescripcion("Monitores Plasma");
		 articulo.setPrecio(160);
		 
		 /*ArticuloDAO articuloDAO =  (ArticuloDAO)factory.getBean("articuloDAO");
		 articuloDAO.saveArticulo(articulo);*/
		 
		 ArticuloService articuloService = (ArticuloService)factory.getBean("articuloService");
		 articuloService.saveArticulo(articulo);
		 
		 List<Articulo> listArticulo = articuloService.findArticulo();
		 for (Iterator<Articulo> iterator = listArticulo.iterator(); iterator.hasNext();) {
			Articulo obj = iterator.next();
			System.out.println("Articulo = " + obj.getDescripcion());
		}

		 System.out.println("Fin de Pruebas");
	}

}
