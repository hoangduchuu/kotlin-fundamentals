**Name**

### app.java

public class App {
    public static void main(String[] args) {
        System.out.println(ComunicatorFunctionYouCanPutAnyThingHere.max(12, 3));
    }
}


### Expression.kt
@file:JvmName("ComunicatorFunctionYouCanPutAnyThingHere")
 fun max (a: Int, b: Int) : Int  = if (a> b) a else b

