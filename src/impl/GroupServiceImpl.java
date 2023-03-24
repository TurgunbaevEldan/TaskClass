package impl;

import db.DataBase;
import model.model.model.Group;
import service.GroupService;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImpl implements GroupService {

    @Override
    public String addNewGroup(GroupLayout.Group group) {
        DataBase dataBase = new DataBase();
        dataBase.getGroups().add(dataBase);
            return "Группа удачно создано";
        }
    @Override
    public String getGroupById(int id) {
        DataBase dataBase = new DataBase();
return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        System.out.println("Введите старое навание: ");
        String inputName = new Scanner(System.in).next();
return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}

