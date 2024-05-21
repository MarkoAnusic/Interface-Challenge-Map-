import Enums.GeometryType;
import Enums.Marker;

public interface Mappable {

   //String field JSON_PROPERTY
   String JSON_PROPERTY = "\"properties\" : {%s}";

   //3 abstract methods
   String getLabel();

   GeometryType getGeoType();

   Marker getMarker();

   //default to JSON method
   default void toJSON() {
      String jsonString = String.format("""
              "type" : "%s", "label" : "%s", "marker" : \"%s\"""", getGeoType(), getLabel(), getMarker());
      System.out.print(jsonString);
   }

   //final print method
   static void printMap(Mappable map) {

      System.out.print("\"properties\" : {");
      map.toJSON();
      System.out.println(", " + map + "}");
   }
}
