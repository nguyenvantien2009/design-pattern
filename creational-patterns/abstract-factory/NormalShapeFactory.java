public class NormalShapeFactory implements ShapeFactory {
   
  public Shape createShap(string name) {
    if (name=='CIRCLE') {
      return new Circle(); 
    }
  }
}
