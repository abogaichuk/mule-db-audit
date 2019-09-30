package org.mule.extension.databaseaudit.internal;

import org.mule.extension.databaseaudit.internal.mysql.ConnectionParameters;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(DatabaseAuditOperations.class)
public class DatabaseAuditConfiguration {

  @ParameterGroup(name="parameters")
  private ConnectionParameters parameters;

  @DisplayName("Data Source")
  @Parameter
  @Optional(defaultValue = "#[app.registry.\"dataSource\"]")
  private DriverManagerDataSource datasource;

  public DriverManagerDataSource getDatasource() {
    return datasource;
  }

  public void setPoolDatasource(DriverManagerDataSource datasource) {
    this.datasource = datasource;
  }

  public ConnectionParameters getParameters() {
    return parameters;
  }

  public void setParameters(ConnectionParameters parameters) {
    this.parameters = parameters;
  }

  public void setDatasource(DriverManagerDataSource datasource) {
    this.datasource = datasource;
  }
}
