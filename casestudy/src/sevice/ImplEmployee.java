package sevice;

public interface IEmployee extends ServicePerson{
    @Override
    default void add() {

    }

    @Override
    default void edit() {

    }

    @Override
    default void delete() {

    }

    @Override
    default void display() {

    }
}
