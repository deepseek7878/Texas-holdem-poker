package dzdc.core.enity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.viviframework.petapojo.annotations.Column;
import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("gm_operation_log")
@PrimaryKey(value = "id")
public class GmOperationLog implements Serializable {

    //主键
    private Long id;
    //访问地址
    private String url;
    //操作类型
    private String operationType;
    //操作模块
    private String operationModular;
    //ip
    private String ip;
    //参数
    private String parameter;
    //消耗时间(毫秒)
    private long consumptionTime;
    //操作人
    private String modifyMan;
    //操作时间
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date modifyTime;
    //操作状态
    private String state;
    //描述
    private String represent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationModular() {
        return operationModular;
    }

    public void setOperationModular(String operationModular) {
        this.operationModular = operationModular;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public long getConsumptionTime() {
        return consumptionTime;
    }

    public void setConsumptionTime(long consumptionTime) {
        this.consumptionTime = consumptionTime;
    }

    public String getModifyMan() {
        return modifyMan;
    }

    public void setModifyMan(String modifyMan) {
        this.modifyMan = modifyMan;
    }


    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRepresent() {
        return represent;
    }

    public void setRepresent(String represent) {
        this.represent = represent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
