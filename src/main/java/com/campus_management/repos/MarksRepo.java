package com.campus_management.repos;

import com.campus_management.models.MarksModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarksRepo extends MongoRepository<MarksModel, String> {
}
