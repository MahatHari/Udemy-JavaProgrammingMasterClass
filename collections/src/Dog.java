public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Dog){
            return this.getName().equals(((Dog)obj).getName());
        }
        return false;
    }
}
