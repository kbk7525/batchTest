package com.igloo.batch;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class service {

    public Integrity saveIntegrity(Integrity integrity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startTimeTmp = integrity.getStartTime();
        String endTimeTmp = integrity.getEndTime();

        LocalDateTime startTime = LocalDateTime.parse(startTimeTmp, formatter);
        LocalDateTime endTime = LocalDateTime.parse(endTimeTmp, formatter);

        System.out.println(startTime.format(formatter));
        System.out.println(endTime.format(formatter));
        return integrity;
    }
}
