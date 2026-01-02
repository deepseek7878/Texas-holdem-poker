package dzdc.core.enity;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

@TableName("admin_role_power")
@PrimaryKey("id")
public class AdminRolePower {

    private int id;
    private int roleId;
    private int powerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPowerId() {
        return powerId;
    }

    public void setPowerId(int powerId) {
        this.powerId = powerId;
    }
}
