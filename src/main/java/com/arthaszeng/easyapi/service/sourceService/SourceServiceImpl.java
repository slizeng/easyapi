package com.arthaszeng.easyapi.service.sourceService;

import com.arthaszeng.easyapi.entity.Product;
import com.arthaszeng.easyapi.entity.Source;
import com.arthaszeng.easyapi.repository.ProductRepository;
import com.arthaszeng.easyapi.repository.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceServiceImpl implements SourceService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    SourceRepository sourceRepository;

    @Override
    public Source findSourceBySourceId(String sourceId) {
        return sourceRepository.findBySourceId(sourceId);
    }
}