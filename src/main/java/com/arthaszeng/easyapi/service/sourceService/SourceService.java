package com.arthaszeng.easyapi.service.sourceService;

import com.arthaszeng.easyapi.entity.Source;

public interface SourceService {

    Source findSourceBySourceId(Long sourceId);

    Source addSource(Source source);
}
