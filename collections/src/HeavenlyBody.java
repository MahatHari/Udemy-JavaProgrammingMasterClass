import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final  String name;
    private  final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final  BodyTypes bodyType;

    public    enum BodyTypes{
        STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTEROID
    };

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType= bodyType;
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public  boolean addSatellite(HeavenlyBody moon){
        if (moon.getBodyType()==BodyTypes.MOON){
            return this.satellites.add(moon);
        }
       return false;
    }


    public Set<HeavenlyBody> getSatellites() {
        return  new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj){
        if(this==obj){
            return  true;
        }

        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject= (HeavenlyBody) obj;
            if(this.name.equals(theObject.getName())){
                return this.bodyType==theObject.getBodyType();
            }
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode()+57+this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return this.name+ " : "+this.bodyType + ", "+this.getOrbitalPeriod();
    }
}
