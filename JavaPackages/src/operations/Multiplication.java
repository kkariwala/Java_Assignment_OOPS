package operations;
import history.History;

public class Multiplication{
    public static<T extends Number> T multiply(T t1, T t2){
        if(t1 == null || t2 == null){
            return null;
        }
        if(t1 instanceof Double || t2 instanceof Double){
            double temp = Double.valueOf(t1.doubleValue() * t2.doubleValue());
            History.addTransaction(t1.doubleValue() + " * " + t2.doubleValue() + " = " +  temp);
            return (T) Double.valueOf(t1.doubleValue() * t2.doubleValue()) ;
        }
        else if(t1 instanceof Float || t2 instanceof Float){
            History.addTransaction(t1.floatValue() + " * " + t2.floatValue() + " = " +  Float.valueOf(t1.floatValue() * t2.floatValue()));
            return (T) Float.valueOf(t1.floatValue() * t2.floatValue());
        }
        else if(t1 instanceof Long || t2 instanceof Long){
            History.addTransaction(t1.longValue() + " * " + t2.longValue() + " = " +  Long.valueOf(t1.longValue() * t2.longValue()));
            return (T) Long.valueOf(t1.longValue() * t2.longValue());
        }
        else if(t1 instanceof Integer && t2 instanceof Integer){
            History.addTransaction(t1.intValue() + " * " + t2.intValue() + " = " +  Integer.valueOf(t1.intValue() * t2.intValue()));
            return (T) Integer.valueOf(t1.intValue() * t2.intValue());
        }
        else{
            System.out.println("Hi you have entered a wrong format!!!");
            return null;
        }
    }
}