package dzdc.core.enity;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

import java.util.Date;

/**
 * Created by lghyt on 2017/3/29.
 */
@TableName("admin_user")
@PrimaryKey("id")
public class AdminUser {
    //id
    private int id;

    //用户名
    private String userName;

    //密码
    private String password;

    private int departmentId;

    //是否锁定
    private boolean hasLock;

    //创建时间
    private Date createDate;

    private String realName;

    //手机号码
    private String mobile;
  //输入密码错误次数
    private int errorCount;
    
    private String googleKey;

    public String getGoogleKey() {
		return googleKey;
	}

	public void setGoogleKey(String googleKey) {
		this.googleKey = googleKey;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public boolean isHasLock() {
        return hasLock;
    }

    public void setHasLock(boolean hasLock) {
        this.hasLock = hasLock;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
    
    
}
