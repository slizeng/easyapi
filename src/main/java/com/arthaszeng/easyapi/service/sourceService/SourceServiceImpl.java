package com.arthaszeng.easyapi.service.sourceService;

import org.springframework.beans.factory.annotation.Autowired;
import com.arthaszeng.easyapi.entity.Source;
import com.arthaszeng.easyapi.repository.SourceRepository;
import org.springframework.stereotype.Service;

@Service
public class SourceServiceImpl implements SourceService {
    @Autowired
    private SourceRepository sourceRepository;

    @Override
    public Source findSourceBySourceId(Long sourceId) {
        return sourceRepository.findOne(sourceId);
    }

    @Override
    public Source addSource(Source source) {
        return sourceRepository.save(source);
    }
}
