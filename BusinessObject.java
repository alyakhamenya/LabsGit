public abstract class BusinessObject {
    protected String name;

    public BusinessObject() {
        this.name = "Default Business Object Name";
    }

    public BusinessObject(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}