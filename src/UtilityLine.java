import Enums.GeometryType;
import Enums.Marker;
import Enums.Usage;
import Enums.Utility;

public class UtilityLine implements Mappable {

   private String name;
   private GeometryType geometryType;
   private Marker marker;
   private Utility utility;

   public UtilityLine(final String name, final GeometryType geometryType, final Marker marker, final Utility utility) {
      this.name = name;
      this.geometryType = geometryType;
      this.marker = marker;
      this.utility = utility;
   }

   //3 abstract methods
   @Override
   public String getLabel() {
      return name + " (" + utility + ")";
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
              "name" : "%s", "usage" : \"%s\"""", name, utility);
   }
}

