package at.htlkaindorf.loal_todomanager.model;

import java.util.Objects;

public class Todo {
    private final String id;
    private final String title;
    private final String description;
    private final String priority;
    private final String settlementDate;
    private final String status;

    public Todo(String id, String title, String description, String priority, String settlementDate, String status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.settlementDate = settlementDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(getId(), todo.getId())
                && Objects.equals(getTitle(), todo.getTitle())
                && Objects.equals(getDescription(), todo.getDescription())
                && Objects.equals(getPriority(), todo.getPriority())
                && Objects.equals(getSettlementDate(), todo.getSettlementDate())
                && Objects.equals(getStatus(), todo.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription(), getPriority(), getSettlementDate(), getStatus());
    }

    @Override
    public String toString() {
        return "";
    }
}
