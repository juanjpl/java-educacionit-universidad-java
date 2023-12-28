package ar.com.educacionit.universidad.interfacesII;

public class FileSystem implements IMensaje {

	@Override
	public void enviar(Mensaje msj) {
		
		String path = ((FS)msj).getPath();
		String contenido = msj.getContenido();
		
		Storage storageDentroDelMsj = ((Storage)msj);
		FS fileSystemDentroDelStorage = (FS)storageDentroDelMsj;
		
		//Garantiza quje no haya error dentro ?
		/*
		 * 
		 */
		
		System.out.println("Grabando mensaje en disco:" + msj);

	}

}
