package com.github.askr.toes.models;

import com.github.askr.toes.exceptions.ESException;

/**
 * Interface for transform in ESDocument
 * 
 * @author askr
 * 
 */
public interface ToESDocument {

    /** transform in ESDocument */
    ESDocument toESDocument() throws ESException;

}
