package cl.acid.desafio.helpers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cl.acid.desafio.dao.ImagenDao;
import cl.acid.desafio.dto.ImagenDto;
import cl.acid.desafio.utils.RespuestaDto;

/**
 * 
 * Clase que contiene lógica de negocio la cual se procesa antes de acceder a la
 * base de datos
 * 
 * @author Roberto Olavarria
 * 
 * 
 *
 */
public class ImagenHelper
{

	final static Logger log = Logger.getLogger(ImagenHelper.class);

	/**
	 * objeto que contiene los servicios de insercion o consulta para una imagen
	 */
	private ImagenDao imagenDao;

	public int insertImagen(ImagenDto imagen)
	{
		
		return imagenDao.insertImagenDto(imagen);
					
	}

	public ImagenDto findImagenById(int id){
		
		ImagenDto img = null;
		img = imagenDao.findImagenDtoById(id);
		
		return img;
				
	}
	public void setImagenDao(ImagenDao imagenDao)
	{
		this.imagenDao = imagenDao;
	}

}
