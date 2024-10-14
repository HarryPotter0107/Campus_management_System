package com.campus_management.service;

import com.campus_management.models.NoticeModel;
import com.campus_management.repos.NoticeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepo noticeRepo;

    public List<NoticeModel> getAllNotices() {
        return noticeRepo.findAll();
    }

    public NoticeModel getNoticeById(String id) {
        return noticeRepo.findById(id).orElse(null);
    }

    public void createNotice(NoticeModel noticeData) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        noticeData.setDate(dtf.format(now));
        noticeRepo.save(noticeData);
    }

    public void updateNotice(NoticeModel noticeData) {
        noticeRepo.save(noticeData);
    }

    public void deleteNotice(String id) {
        noticeRepo.deleteById(id);
    }
}
