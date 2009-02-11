package pe.com.sgp.run;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import pe.com.sgp.domain.Cliente;
import pe.com.sgp.service.ClienteService;

public class RunTest {

	public static void main(String[] args) {
		System.out.println("Iniciando Pruebas");

		String pathFile = "./src/main/java/pe/com/sgp/config/SpringApplicationContext.xml";
		Resource resource = new FileSystemResource(pathFile);
		BeanFactory factory = new XmlBeanFactory(resource);

/*		System.out.println("Creando Entity");
		Articulo articulo = new Articulo();
		articulo.setDescripcion("Monitores Plasma");
		articulo.setPrecio(160);
		System.out.println("obteniendo servicios");
		ArticuloService articuloService = (ArticuloService) factory.getBean("articuloService");
		System.out.println("ejecutando servicios");
		articuloService.saveArticulo(articulo);

		List<Articulo> listArticulo = articuloService.findArticulo();
		for (Iterator<Articulo> iterator = listArticulo.iterator(); iterator
				.hasNext();) {
			Articulo obj = iterator.next();
			System.out.println("Articulo = " + obj.getDescripcion());
		}
		System.out.println("Fin de Pruebas");*/
	
		System.out.println("Creando Entity");
		Cliente cliente = new Cliente();
		cliente.setRazonSocial("Adolfo Software Inc");
		cliente.setRuc("10408696688");
		cliente.setTelefono("3625844");
		cliente.setDireccion("lima");
		cliente.setRepresentante("Adolfo");
		cliente.setDni("11111111");
		
		System.out.println("obteniendo servicios de Spring");
		ClienteService clienteService =  (ClienteService) factory.getBean("clienteService");
		
		System.out.println("Ejecutando servicios de Spring");
		clienteService.saveCliente(cliente);
		System.out.println("Fin de Pruebas");
	}

}
