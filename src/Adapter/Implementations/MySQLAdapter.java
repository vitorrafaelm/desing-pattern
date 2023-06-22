package Adapter.Implementations;

import Adapter.Interface.CrudMetodsInterface;

public class MySQLAdapter implements CrudMetodsInterface {
    private MysqlCommands mysqlCommands;

    public MySQLAdapter(MysqlCommands mysqlCommands) {
        this.mysqlCommands = mysqlCommands;
    }

    @Override
    public String insert(String string) {
        return this.mysqlCommands.insertMysql(string);
    }

    @Override
    public String update(String string) {
        return this.mysqlCommands.updateMysql(string);
    }

    @Override
    public String delete(String string) {
        return this.mysqlCommands.deleteMysql(string);
    }
}
