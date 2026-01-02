package dzdc.core.enity;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

@TableName("sys_info")
@PrimaryKey(value = "id", autoIncrement = false)
public class SysInfo {

	private Integer id;		//主键
	private String sysName; 	//系统名称
	private String sysUrl;		//系统域名访问路径
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getSysUrl() {
		return sysUrl;
	}
	public void setSysUrl(String sysUrl) {
		this.sysUrl = sysUrl;
	}
}
