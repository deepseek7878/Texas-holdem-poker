package dzdc.core.enity;

import com.viviframework.petapojo.annotations.PrimaryKey;
import com.viviframework.petapojo.annotations.TableName;

@TableName("admin_role_menu")
@PrimaryKey("id")
public class AdminRoleMenu {

    private int id;
    private int roleId;
    private int menuId;

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

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
}
