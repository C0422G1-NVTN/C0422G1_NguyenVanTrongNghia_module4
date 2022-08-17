package com.mailbox.repository;

import com.mailbox.model.Email;

import java.util.List;

public interface IMailRepository {
    List<String> displayLanguages();

    List<Integer> displaySize();

    List<Email> saveEmail(Email email);
}
