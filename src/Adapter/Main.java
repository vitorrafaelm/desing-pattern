package Adapter;

import Adapter.Implementations.MySQLAdapter;
import Adapter.Implementations.MysqlCommands;
import Adapter.Implementations.PostgresqlAdapter;
import Adapter.Implementations.PostgresqlCommands;
import Adapter.Interface.CrudMetodsInterface;

public class Main {

    public static void main(String[] args) {

        CrudMetodsInterface mySQLAdapter = new MySQLAdapter(new MysqlCommands());

        System.out.println(mySQLAdapter.insert("Data inserted Mysql"));
        System.out.println(mySQLAdapter.update("Data updated Mysql"));
        System.out.println(mySQLAdapter.update("Data deleted Mysql"));

        CrudMetodsInterface postgresqlAdapter = new PostgresqlAdapter(new PostgresqlCommands());

        System.out.println(postgresqlAdapter.insert("Data inserted Postgresql"));
        System.out.println(postgresqlAdapter.update("Data updated Postgresql"));
        System.out.println(postgresqlAdapter.update("Data deleted Postgresql"));
    }
}