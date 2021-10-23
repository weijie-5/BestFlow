package bestflow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 工作流主任务表
 * </p>
 *
 * @author weijie.wu
 * @since 2021-10-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("flow_main")
@ApiModel(value="FlowMain对象", description="工作流主任务表")
public class FlowMain implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "任务流名称")
    private String flowName;

    @ApiModelProperty(value = "插入时间")
    private Date insertDate;

    @ApiModelProperty(value = "更新时间")
    private Date updateDate;


}
