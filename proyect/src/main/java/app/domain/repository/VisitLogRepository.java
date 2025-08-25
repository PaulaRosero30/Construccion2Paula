package app.domain.repository;

import java.util.Optional;

import app.domain.model.VisitLog;

public interface VisitLogRepository {
    VisitLog save(VisitLog record);
    Optional<VisitLog> findById(Long id);
}