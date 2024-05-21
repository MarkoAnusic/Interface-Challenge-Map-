import Enums.GeometryType;
import Enums.Marker;
import Enums.Usage;
import Enums.Utility;

public class Main {
   public static void main(String[] args) {

      Building b = new Building("Sydney Town Hall", GeometryType.POINT, Marker.STAR, Usage.GOVERNMENT);
      Mappable.printMap(b);

      UtilityLine ut = new UtilityLine("College St", GeometryType.LINE, Marker.DOTTED, Utility.FIBER_OPTIC);
      Mappable.printMap(ut);
   }
}