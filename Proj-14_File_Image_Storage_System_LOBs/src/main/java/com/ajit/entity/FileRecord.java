package com.ajit.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="FILE_RECORDS")
public class FileRecord {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@NonNull
	@Column(length=30)
	private String fileName;
	
	@NonNull
	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String fileText;
	
	@NonNull
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] fileImage;
	
	//Extra added for video
	@NonNull
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] fileVideo;

}
