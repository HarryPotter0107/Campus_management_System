package com.campus_management.repos;

import com.campus_management.models.SubjectModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepo extends MongoRepository<SubjectModel, String> {
}
