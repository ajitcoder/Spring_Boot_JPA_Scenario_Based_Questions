package com.ajit.runners;

import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajit.service.FileStorageService;

//@Component
//public class LobStorageRunner implements CommandLineRunner {
//
//	@Autowired
//	FileStorageService fileStorageService;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter text file path");
//		String textFile = sc.nextLine();
//		System.out.println("Enter image file path");
//		String imageFile = sc.nextLine();
//		String storeFileAndImage = fileStorageService.storeFileAndImage(textFile, imageFile);
//		System.out.println(storeFileAndImage);
//	}
//
//}

@Component
public class LobStorageRunner implements CommandLineRunner {

    @Autowired
    FileStorageService fileStorageService;

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text file path:");
        String textFile = sc.nextLine();

        System.out.println("Enter image file path:");
        String imageFile = sc.nextLine();

        System.out.println("Enter video file path:");
        String videoFile = sc.nextLine();

        String result = fileStorageService
                .storeFileImageAndVideo(textFile, imageFile, videoFile);

        System.out.println(result);
    }
}

