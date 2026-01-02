package dzdc.core.enity;

import org.joda.time.DateTime;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

@TableName("admin_operation_log")
@PrimaryKey("id")
public class AdminOperationLog {
	
	private int id;
	private Integer uid;//用户id
	private String userName;//用户名
	private String ip;//用户ip
	private Integer menuId;//模块id
	private String menuName;//模块名
	private String url;//访问路径
	private String operation;//操作
	private DateTime createDate;//创建时间
	private int SysId;//系統id
	
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public int getSysId() {
		return SysId;
	}
	public void setSysId(int sysId) {
		SysId = sysId;
	}
	
	
}
