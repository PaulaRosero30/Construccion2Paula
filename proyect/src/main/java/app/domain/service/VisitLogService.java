package app.domain.service;

import app.domain.model.VisitLog;
import app.domain.repository.VisitLogRepository;

public class VisitLogService {

    private final VisitLogRepository repository;

    public VisitLogService(VisitLogRepository repository) {
        this.repository = repository;
    }

    public VisitLog registerVisit(VisitLog log) {
        return repository.save(log);
    }

    public VisitLog getVisit(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Record not found"));
    }
}