package com.mailbox.service.impl;

import com.mailbox.model.Email;
import com.mailbox.repository.IMailRepository;
import com.mailbox.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService implements IMailService {
    @Autowired
    private IMailRepository iMailRepository;

    @Override
    public List<String> displayLanguages() {
        return iMailRepository.displayLanguages();
    }

    @Override
    public List<Integer> displaySize() {
        return iMailRepository.displaySize();
    }

    @Override
    public List<Email> saveEmail(Email email) {
        return iMailRepository.saveEmail(email);
    }
}
