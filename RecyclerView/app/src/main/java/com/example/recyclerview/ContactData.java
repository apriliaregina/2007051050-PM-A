package com.example.recyclerview;
import java.util.ArrayList;

public class ContactData {
    public static String[][] data = new String[][]{
            {"Nanda Karizki", "https://randomuser.me/api/portraits/lego/1.jpg"},
            {"Roby Awaludin", "https://randomuser.me/api/portraits/lego/2.jpg"},
            {"Regita Ayuni", "https://randomuser.me/api/portraits/lego/3.jpg"},
            {"Putri Sinta", "https://randomuser.me/api/portraits/lego/4.jpg"},
            {"Rawat Aji", "https://randomuser.me/api/portraits/lego/5.jpg"},
            {"Shalsa Bila", "https://randomuser.me/api/portraits/lego/6.jpg"},
            {"Dyna Shafa", "https://randomuser.me/api/portraits/lego/7.jpg"},
            {"Raditya", "https://randomuser.me/api/portraits/lego/8.jpg"},
            {"Titys", "https://randomuser.me/api/portraits/lego/9.jpg"},
            {"Aprilia Regina", "https://randomuser.me/api/portraits/lego/0.jpg"}
};
    public static ArrayList<Contact> getListData(){
        Contact contact = null;
        ArrayList<Contact> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++){
        contact = new Contact();
        contact.setName(data[i][0]);
        contact.setPhoto(data[i][1]);
        list.add(contact);
        }
        return list;
        }

}
