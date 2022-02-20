package com.github.askr.filestoes.processors;

import com.github.askr.filestoes.common.Constants;
import com.github.askr.filestoes.models.FileToES;
import com.github.askr.toes.models.ESDocument;
import com.github.askr.toes.processors.AbstractESItemProcessor;

/**
 * Processor - Transform person into ESDocument
 * 
 * @author askr
 * 
 */
public class PersonItemProcessor extends AbstractESItemProcessor<FileToES> {

    @Override
    public ESDocument process(FileToES item) throws Exception {
        ESDocument document = new ESDocument();
        document.setIndex(environment.getProperty(Constants.CONFIG_ES_INDEX));
        document.setType(environment.getProperty(Constants.CONFIG_ES_TYPE));
        document.setId(item.getId());
        document.setSource(mapper.writeValueAsString(item));
        return document;
    }
}
