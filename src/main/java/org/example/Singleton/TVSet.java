package org.example.Singleton;

public class TVSet {
    private static TVSet tvSetInstance = null;

    // private constructor
    private TVSet(){
        System.out.println("TV Set instantiated");
    }

    public static TVSet getTVSetInstance(){
      if(tvSetInstance == null)
          tvSetInstance = new TVSet();
      return tvSetInstance;
    }
}
