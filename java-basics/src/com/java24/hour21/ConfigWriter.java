package com.java24.hour21;

import java.io.*;

/**
 * Writing output to a stream...
 * 
 * @author Shirrine
 *
 */
public class ConfigWriter {
	
	String newLine = System.getProperty("line.separator");
	
	/**
	 * Writes data to a file.
	 */
	public ConfigWriter(){
		
		File file = new File("program.properties");
		
		try(FileOutputStream fileStream = new FileOutputStream(file)){
			
			write(fileStream, "username=shirrine");
			write(fileStream, "score=100");
			write(fileStream, "level=5");
			fileStream.close();
			
		} catch(IOException e){
			System.out.println("Could not write file.");
		}
	}
	
	/**
	 * Converts the string to bytes and outputs to the stream.
	 * 
	 * @param stream the output stream
	 * @param output the data
	 * @throws IOException
	 */
	private void write(FileOutputStream stream, String output) throws IOException{
		
		byte[] data = stringToBytes(output + newLine);
		stream.write(data);
	}
	
	/**
	 * Converts an ASCII string to bytes.
	 * 
	 * @param string the string to convert
	 * @return the byte array
	 */
	private byte[] stringToBytes(String string){
		
		byte[] bytes = new byte[string.length()];
		for(int i = 0; i < string.length(); i++){
			bytes[i] = (byte) string.charAt(i);
		}
		return bytes;
	}
	
	/**
	 * Writes a config file.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args){
		new ConfigWriter();
	}

}
