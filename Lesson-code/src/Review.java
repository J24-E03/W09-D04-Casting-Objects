/*
public: value is accessible anywhere in our project
private: value is only accessible within the current class
protected: value is accessible within the package and all subclasses(children)
default (package-protected): value is accessible within the same package only
*/

class Second{
    Integer i;

    Second(){


    }
}

public class Review {
    public static void main(String[] args) {
        Second s = new Second();


        System.out.println(s.i);

    }
}
