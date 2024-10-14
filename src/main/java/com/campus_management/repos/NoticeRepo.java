package com.campus_management.repos;

import com.campus_management.models.NoticeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoticeRepo extends MongoRepository<NoticeModel, String> {
}
