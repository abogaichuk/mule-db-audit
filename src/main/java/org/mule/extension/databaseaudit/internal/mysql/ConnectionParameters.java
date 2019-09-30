package org.mule.extension.databaseaudit.internal.mysql;

import org.mule.extension.databaseaudit.internal.DataSourceConfig;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

public class ConnectionParameters implements DataSourceConfig {

    private static final String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String NEW_MYSQL_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String MY_SQL_PREFIX = "jdbc:mysql://";

    @Parameter
    @Placement(order = 1)
    private String host;

    /**
     * Configures the port of the database.
     */
    @Parameter
    @Placement(order = 2)
    private Integer port;

    /**
     * The user to use for authentication against the database.
     */
    @Parameter
    @Optional
    @Placement(order = 3)
    private String user;

    /**
     * The password to use for authentication against the database.
     */
    @Parameter
    @Optional
    @Placement(order = 4)
    @Password
    private String password;

    /**
     * The name of the database.
     */
    @Parameter
    @Optional
    @Placement(order = 5)
    private String database;

    @Override
    public String getUrl() { //jdbc:mysql://localhost:3306/audit
        return MY_SQL_PREFIX+host+":"+port+"/"+database;
    }

    @Override
    public String getDriverClassName() {
        return MYSQL_DRIVER_CLASS;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUser() {
        return user;
    }
}
