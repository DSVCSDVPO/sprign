package generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @TableName app_info
 */
@TableName(value ="app_info")
@Data
public class AppInfo implements Serializable {
    private Long id;

    private String softwarename;

    private String apkname;

    private String supportrom;

    private String interfacelanguage;

    private BigDecimal softwaresize;

    private Date updatedate;

    private Long devid;

    private String appinfo;

    private Long status;

    private Date onsaledate;

    private Date offsaledate;

    private Long flatformid;

    private Long categorylevel3;

    private Long downloads;

    private Long createdby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

    private Long categorylevel1;

    private Long categorylevel2;

    private String logopicpath;

    private String logolocpath;

    private Long versionid;

    private static final long serialVersionUID = 1L;
}