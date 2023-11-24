package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.AppInfo;
import generator.service.AppInfoService;
import generator.mapper.AppInfoMapper;
import org.springframework.stereotype.Service;

/**
 * @author zbx20
 * @description 针对表【app_info】的数据库操作Service实现
 * @createDate 2023-10-23 11:41:55
 */
@Service
public class AppInfoServiceImpl extends ServiceImpl<AppInfoMapper, AppInfo> implements AppInfoService {

}




