package generator.text;

import generator.domain.AppInfo;
import generator.service.AppInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@Slf4j
public class text {
    @Autowired
    private AppInfoService appInfoService;

    @GetMapping("{id}")
    public void oo(@PathVariable("id") Long id) {
        appInfoService.getById(id);
    }
}
