package TemplateMethod.AbstarctClass;

public abstract class TemplateMethodBaseClassCreateUserAndLogin<T> {
    public final void execute(T user) {
        T userCreated = createUser(user);
        login(userCreated);
        notificaPadrao();
    }

    protected abstract T createUser(T user);

    protected abstract String login(T user);

    protected abstract void notificaPadrao();
}
