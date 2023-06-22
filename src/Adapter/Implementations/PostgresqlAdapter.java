package Adapter.Implementations;

import Adapter.Interface.CrudMetodsInterface;

public class PostgresqlAdapter implements CrudMetodsInterface {

    private PostgresqlCommands postgresqlCommands;

    public PostgresqlAdapter(PostgresqlCommands postgresqlCommands) {
        this.postgresqlCommands = postgresqlCommands;
    }

    @Override
    public String insert(String string) {
        return this.postgresqlCommands.insertPostgres(string);
    }

    @Override
    public String update(String string) {
        return this.postgresqlCommands.updatePostgres(string);
    }

    @Override
    public String delete(String string) {
        return this.postgresqlCommands.deletePostgres(string);
    }
}
