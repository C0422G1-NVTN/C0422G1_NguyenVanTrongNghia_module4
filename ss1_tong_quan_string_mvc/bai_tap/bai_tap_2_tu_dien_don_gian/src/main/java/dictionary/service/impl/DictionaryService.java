package dictionary.service.impl;

import dictionary.repository.IDictionaryRepository;
import dictionary.repository.impl.DictionaryRepository;
import dictionary.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    IDictionaryRepository iDictionaryRepository = new DictionaryRepository();
    @Override
    public String findByName(String keySearch) {
        return iDictionaryRepository.findByName(keySearch);
    }
}
