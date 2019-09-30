package org.mule.extension.databaseaudit.internal;

public interface DataSourceConfig {
    /**
     * The JDBC URL to be used to connect to the database
     */
    String getUrl();

    /**
     * Full qualifier name of the Driver Class to connect to the database
     */
    String getDriverClassName();

    /**
     * Password to use to login into the database
     */
    String getPassword();

    /**
     * User to use to login into the database
     */
    String getUser();
}
