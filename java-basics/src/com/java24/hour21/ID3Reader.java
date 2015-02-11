package com.java24.hour21;

import java.io.*;

/**
 * File I/O...
 * 
 * @author Shirrine
 *
 */
public class ID3Reader {
	
	/**
	 * Displays ID3 data from an mp3 file.
	 * 
	 * @param args the mp3 file name
	 */
	public static void main(String[] args){
		
		// Validation
		if(args == null || args.length != 1){
			throw new IllegalArgumentException("Please enter an mp3 file name.");
		}
		
		// File Object
		File song = new File(args[0]);
		
		// Try-with-resources block to ensure stream is closed at the end of the try/catch block
		try(FileInputStream file = new FileInputStream(song)){
			
			// Get the mp3 file size
			int size = (int) song.length();
			
			// Offset into the ID3 data
			file.skip(size - 128); 
			
			// Open the stream (128 bytes)
			byte[] last128 = new byte[128];
			file.read(last128);
			
			// Process the data
			String id3 = new String(last128);
			String tag = id3.substring(0,3);
			if(tag.equals("TAG")){
				System.out.println("Title: " + id3.substring(3,32));
				System.out.println("Artist: " + id3.substring(33,62));
				System.out.println("Album: " + id3.substring(63,91));
				System.out.println("Year: " + id3.substring(93,97));
			} else{
				System.out.println(args[0] + " does not contain ID3 info.");
			}
			
			// Close the stream
			file.close();
			
		} catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
	}

}
