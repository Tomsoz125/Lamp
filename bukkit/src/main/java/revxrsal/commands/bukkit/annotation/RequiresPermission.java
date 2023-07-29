package revxrsal.commands.bukkit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPermission {
    /**
     * The permission node
     *
     * @return The permission node
     */
    String value();

    /**
     * Who can use this completion by default.
     *
     * @return Permission's default access. Default is {@link PermissionDefault#OP}.
     */
    PermissionDefault defaultAccess() default PermissionDefault.OP;
}
