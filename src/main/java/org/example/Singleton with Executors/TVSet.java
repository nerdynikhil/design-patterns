package org.example.Singleton;

public class TVSet {
    private static volatile TVSet tvSetInstance = null;

    // private constructor
    private TVSet(){
        System.out.println("TV Set instantiated");
    }

    public static TVSet getTVSetInstance() {
        if (tvSetInstance == null) { //optimization
            synchronized (TVSet.class) { //t2
                if (tvSetInstance == null) // double check
                    tvSetInstance = new TVSet();
            }
        }
        // heavy work done here
        return tvSetInstance;
    }
}
