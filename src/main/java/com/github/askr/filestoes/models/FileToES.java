package com.github.askr.filestoes.models;


import java.util.List;

/**
 * FileToES
 * 
 * @author askr
 * 
 */
public class FileToES {

    /** id */
    private String id;

    /** last name */
    private String name;

    /** first name */
    private String content;

    /** attachment */
    private List<FileToES> attachments;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the attachments
     */
    public List<FileToES> getAttachments() {
        return attachments;
    }

    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(List<FileToES> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "id:" + id + ",content: " + content + ", name: " + name;
    }
}