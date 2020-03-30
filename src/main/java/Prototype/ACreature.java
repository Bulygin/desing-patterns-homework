package Prototype;

abstract class ACreature implements ICreature {
    String Name; // имя существа

    @Override
    public ICreature clone(String name) {
        return null;
    }
}
