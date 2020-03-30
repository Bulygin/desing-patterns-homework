package Prototype;

public interface ICreature {
    void getName(); // имя

    ICreature clone(String name); // сделать клона
}
