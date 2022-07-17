package com.hiran.training;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class getDirectory {
	
	
	private static String downloadPath = "C:\\Users\\VssAdministrator\\Downloads\\fileTestPIM.pdf";
    File f = new File(downloadPath);
	
	@Test(priority = 1)
    public void testDirectory() throws IOException {
       
        System.out.print("File Directory ");
        File folder = new File(downloadPath);
        File[] listOfFiles = folder.listFiles();

        for (int i =0; i<listOfFiles.length;i++) {
            if(listOfFiles[i].isFile()) {
                System.out.println("File "+listOfFiles[i].getName());
            }else if(listOfFiles[i].isDirectory()) {
                System.out.println("Directory "+ listOfFiles[i].getName());
            }
        }
    }
	
	
	

}
