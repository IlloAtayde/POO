package sockets;

import java.io.*;
import java.net.*;


public class Transmission {

	public static void transmitirLog(String logAnimais) throws IOException {
		int porta =  80;

		ServerSocket servidor = new ServerSocket(porta);
		System.out.println("----------------------------------------");
		System.out.println("Servidor criado na porta " + porta);
		Socket conexao = null;

		//while(true) {

				System.out.println("Servidor esperando conexao na porta " + porta);
				conexao = servidor.accept( ); // esperando uma conexao
				BufferedReader entrada = new BufferedReader (new InputStreamReader(conexao.getInputStream()));
				BufferedWriter saida = new BufferedWriter (new OutputStreamWriter(conexao.getOutputStream()));

				String s;

				while ((s = entrada.readLine()) != null){
					//System.out.println(s);
					if (s.isEmpty()){
						break;
					}
				}

			saida.write("HTTP/1.1 200 OK\r\n");
	        saida.write("Content-Type: text/html\r\n");
	        saida.write("\r\n");
	        saida.write("<!DOCTYPE html>");
	        saida.write("<html lang=\"pt-br\">");
	        saida.write("<head>");
	        saida.write("<meta charset=\"UTF-8\">");
	        saida.write("<title>Abrigo de Animais</title>");
	        saida.write("</head>");
	        saida.write("<h1>Relatório de animais cadastrados</h1>");
	        saida.write(logAnimais);
	        System.err.println("Conexão encerrada!");
	        saida.close();
	        entrada.close();
	        conexao.close();
	        servidor.close();
				

		//}
	}

}
