/**
 * 
 */
package streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author illoatayde
 *
 */
public class Arquivos {

	/**
	 * 
	 */
	//private ObjectInputStream stream_entrada = null;
	//private ObjectOutputStream stream_saida = null;
	
	public static void SalvarObjArquivo(Object o, String nomeArq) throws IOException, FileNotFoundException {
		
		ObjectOutputStream stream_saida = null;
		
		try {
			stream_saida = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomeArq)));
			stream_saida.writeObject(o);
		}finally{
			stream_saida.close();
			}
			
	}
	
	public static Object RecuperarObjArquivo(String nomeArq) throws IOException, FileNotFoundException, ClassNotFoundException {
		
		ObjectInputStream stream_entrada = null;
		
		try {
			stream_entrada = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomeArq)));
			return stream_entrada.readObject();
		}finally{
			stream_entrada.close();
			}
			
	}
		
}


