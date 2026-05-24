package com.ajit.service;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajit.entity.FileRecord;
import com.ajit.repository.FileRecordRepository;

//@Service
//public class FileStorageService {
//
//	@Autowired
//	FileRecordRepository repository;
//	
//	
//	public String storeFileAndImage(String textFilePath, String imageFilePath) throws IOException{
//		
//		String text = Files.readString(Path.of(textFilePath));
//		byte[] image = Files.readAllBytes(Path.of(imageFilePath));
//		
//		
//		FileRecord save = repository.save(new FileRecord("New File",text,image));
//		
//		return "FileRecord save successfully"+save.getFileName();
//		
//	}
//
//	public String retrieveAndWriteToDisk(Long id, String outputTextPath, String outputImagePath) {
//		return outputImagePath;
//		
//	}
//
//
//}
@Service
public class FileStorageService {

    @Autowired
    FileRecordRepository repository;

    public String storeFileImageAndVideo(
            String textFilePath,
            String imageFilePath,
            String videoFilePath) throws IOException {

        String text = Files.readString(Path.of(textFilePath));
        byte[] image = Files.readAllBytes(Path.of(imageFilePath));
        byte[] video = Files.readAllBytes(Path.of(videoFilePath)); // 🔹 video

        FileRecord record = new FileRecord(
                "New File",
                text,
                image,
                video
        );

        repository.save(record);

        return "File, Image and Video saved successfully";
    }
}
