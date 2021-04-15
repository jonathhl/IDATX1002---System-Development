package edu.ntnu.idatt1002.k2g10.models;

import java.io.Serializable;

import java.time.LocalDateTime;

/**
 * Task is contained in {@link TaskList} and is associated with {@link Category}
 * 
 * @author hasanro, trthingnes, bragemi
 */
public class Task implements Serializable {
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Priority priority;
    private Category category;
    private boolean completed = false;

    /**
     * Constructor of Task class
     * 
     * @param title
     *            Title of the task
     * @param description
     *            Description of a task
     * @param startTime
     *            Time start of the task
     * @param endTime
     *            Deadline of the task
     * @param priority
     *            Task priority
     * @param category
     *            Category of the task object
     */
    public Task(String title, String description, LocalDateTime startTime, LocalDateTime endTime, Priority priority,
            Category category) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.category = category;
    }

    /**
     * Constructor of Task class
     * 
     * @param title
     *            Title of the task
     * @param description
     *            Description of a task
     * @param startTime
     *            Time start of the task
     * @param endTime
     *            Deadline of the task
     * @param priority
     *            Task priority
     */
    public Task(String title, String description, LocalDateTime startTime, LocalDateTime endTime, Priority priority) {
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.category = null;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public Category getCategory() {
        return category;
    }

    public void removeCategory(Category category) {
        category = null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setCompleted() {
        completed = true;
    }

    public void setNotCompleted() {
        completed = false;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}