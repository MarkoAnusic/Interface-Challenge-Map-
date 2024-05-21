import Enums.GeometryType;
import Enums.Marker;
import Enums.Usage;

public class Building implements Mappable {

   private String name;
   private GeometryType geometryType;
   private Marker marker;
   private Usage usage;

   public Building(String name, GeometryType geometryType, Marker marker, Usage usage) {
      this.name = name;
      this.geometryType = geometryType;
      this.marker = marker;
      this.usage = usage;
   }

   //3 abstract methods
   @Override
   public String getLabel() {
      return name + " (" + usage + ")";
   }

   @Override
   public GeometryType getGeoType() {
      return geometryType;
   }

   @Override
   public Marker getMarker() {
      return marker;
   }

   //to String
   @Override
   public String toString() {
      return String.format("""
              "name" : "%s", "usage" : \"%s\"""", name, usage);
   }
}
