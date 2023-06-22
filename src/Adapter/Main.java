package Adapter;

import Adapter.Implementations.MySQLAdapter;
import Adapter.Implementations.MysqlCommands;
import Adapter.Interface.CrudMetodsInterface;

public class Main {

    public static void main(String[] args) {

        CrudMetodsInterface mySQLAdapter = new MySQLAdapter(new MysqlCommands());

        System.out.println(mySQLAdapter.insert("Data inserted Mysql"));
        System.out.println(mySQLAdapter.update("Data updated Mysql"));
        System.out.println(mySQLAdapter.update("Data deleted Mysql"));
    }
}