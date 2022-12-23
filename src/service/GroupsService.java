package service;

import model.Groups;
import model.Student;

public class GroupsService {

    public Groups[] groupList=new Groups[100];

    private int index=0;

    public Groups checkGroup(String groupName ){
         for (Groups groups : groupList) {
            if(groups !=null){
                if (groups.getGroupName().equals(groupName))
                {
                    return groups;
                }
            }
        }
         return null;
    }

    public boolean addGroup(String groupName){
        if (checkGroup(groupName)==null){
            groupList[index++]=new Groups(groupName);
            return true;
        }
        return false;
    }


}
