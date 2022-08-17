package com.mailbox.service;

import com.mailbox.model.Email;

import java.util.List;

public interface IMailService {
    List<String> displayLanguages();

    List<Integer> displaySize();

    public List<Email> saveEmail(Email email);
}
