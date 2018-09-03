package listeners

import gov.va.vinci.echo.listeners.BasicDatabaseListener
import gov.va.vinci.leo.tools.LeoUtils

int batchSize = 1000

// MySQL connection
// String url = "jdbc:mysql://localhost:3306/<DB_NAME>?autoReconnect=true&useSSL=false"
// String driver = "com.mysql.jdbc.Driver"
// String dbUser = "<DB_USER>"
// String dbPwd = "<DB_PASSWORD>"
// String dbsName = "<DB_NAME>"
// String tableName = "<DB_TABLE_NAME>"

// Microsoft SQL connection
String url = "jdbc:sqlserver://<SERVER_ADDRESS>:1433;databasename=<DB_NAME>;integratedSecurity=false"
String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
String dbUser = "<DB_USER>"
String dbPwd = "<DB_PASSWORD>"
String dbsName = "<DB_NAME>"
String tableName = "<DB_TABLE_NAME>"

incomingTypes = "gov.va.vinci.echo.types.Relation1"

fieldList = [
        ["DocID", "0", "varchar(500)"],
        ["Mapping", "-1", "varchar(500)"],
        ["Value", "-1", "varchar(100)"],
        ["Value2", "-1", "varchar(100)"],
        ["Unit", "-1", "varchar(25)"],
        ["ValueString", "-1", "varchar(100)"],
        ["Assessment", "-1", "varchar(100)"],
        ["InstanceID", "-1", "int"],
        ["Term", "-1", "varchar(100)"],
        ["Snippets", "-1", "varchar(8000)"],
        ["SpanStart", "-1", "int"],
        ["SpanEnd", "-1", "int"]
]

boolean dropExisting = false;
listener = BasicDatabaseListener.createNewListener(
        driver,
        url,
        dbUser,
        dbPwd,
        dbsName,
        tableName,
        batchSize,
        fieldList,
        incomingTypes)

// Comment out the statement below if you want to add to the existing table
listener.createTable(dropExisting);
