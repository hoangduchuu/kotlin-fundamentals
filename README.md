 #Default function param with java function

### with default function declare in java ` just using` 
    @JvmOverloads
    
### app.java

    public class App {
        public static void main(String[] args) {
            System.out.println(ComunicatorFunctionYouCanPutAnyThingHere.max(12, 3));
            displayfunctions.log("log from java");

        }
    }


### main.kt
    @file:JvmName("displayfunctions")
    
    
    fun main(args: Array<String>) {
        println("hello, world");
        log("log ne", 3)
    }
    
    @JvmOverloads
    fun log(msg: String, loglevel: Int = 2) = println(msg + " " + loglevel);


