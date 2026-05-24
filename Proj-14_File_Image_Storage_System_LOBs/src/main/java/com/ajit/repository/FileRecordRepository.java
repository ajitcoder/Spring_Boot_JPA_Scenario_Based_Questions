package com.ajit.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ajit.entity.FileRecord;

public interface FileRecordRepository extends JpaRepository<FileRecord, Long> {

}
