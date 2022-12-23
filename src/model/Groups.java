package model;

import java.util.UUID;

public class Groups {

    private String groupName;
    private UUID groupId;



    public Groups() {
        this.groupId=UUID.randomUUID();
    }

    public Groups(String groupName) {
        this();
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
