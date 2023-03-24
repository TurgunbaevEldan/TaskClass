package service;

import model.model.model.Group;

import javax.swing.*;
import java.util.List;

public interface GroupService {
    String addNewGroup(GroupLayout.Group group);

    // with stream
    String getGroupById(int id);

    //with stream
    List<Group> getAllGroups();

    //with stream
    String updateGroupName(int id, String groupName);

    //with stream (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>filterByYear(int year, String ascDesc);

    //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>sortGroupByYear(String ascDesc);

    //with stream
    void deleteGroupById(int id);
}
