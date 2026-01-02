package dzdc.core.enity;

import dzdc.core.enums.PasswordStatus;
import org.joda.time.DateTime;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

@TableName("admin_password_log")
@PrimaryKey("id")
public class AdminPasswordLog {

    // Id
    private int id;
    private Integer uid;
    private String oldPassWord;
    private String newPassWord;
    private PasswordStatus status;
    private DateTime modifyDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getOldPassWord() {
        return oldPassWord;
    }
    public void setOldPassWord(String oldPassWord) {
        this.oldPassWord = oldPassWord;
    }
    public String getNewPassWord() {
        return newPassWord;
    }
    public void setNewPassWord(String newPassWord) {
        this.newPassWord = newPassWord;
    }
    public PasswordStatus getStatus() {
        return status;
    }
    public void setStatus(PasswordStatus status) {
        this.status = status;
    }
    public DateTime getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(DateTime modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}

