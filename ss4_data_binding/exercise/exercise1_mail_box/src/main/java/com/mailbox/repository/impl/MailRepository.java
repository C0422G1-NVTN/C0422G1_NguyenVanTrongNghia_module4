package com.mailbox.repository.impl;

import com.mailbox.model.Email;
import com.mailbox.repository.IMailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {
    private List<Email> emailList = new ArrayList<>();
    private static List<String> listLanguages = new ArrayList<>();

    static {
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
    }

    private static List<Integer> listSize = new ArrayList<>();

    static {
        listSize.add(5);
        listSize.add(10);
        listSize.add(15);
        listSize.add(25);
        listSize.add(50);
        listSize.add(100);
    }

    @Override
    public List<String> displayLanguages() {
        return listLanguages;
    }

    @Override
    public List<Integer> displaySize() {
        return listSize;
    }

    @Override
    public List<Email> saveEmail(Email email) {

        emailList.add(email);
        return emailList;
    }
}
