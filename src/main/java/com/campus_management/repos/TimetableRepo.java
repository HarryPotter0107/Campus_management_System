package com.campus_management.repos;

import com.campus_management.models.TimetableModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimetableRepo extends MongoRepository<TimetableModel, String> {
}
