package ac.su.kiosk.service;

import ac.su.kiosk.domain.CustomOption;
import ac.su.kiosk.repository.CustomOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomOptionService {
    @Autowired
    private  CustomOptionRepository customOptionRepository;

    public List<CustomOption> getCustomOptionsByMenu(int id) {
        return customOptionRepository.findCustomOptionsByMenuId(id);
    }
}
