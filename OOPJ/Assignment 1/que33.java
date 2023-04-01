/*
Pass integer, float and double value from command line. Parse it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
 */
class que33{
    public static void main(String args[]){
        int x=Integer.parseInt(args[0]);
        float y=Float.parseFloat(args[1]);
        double z=Double.parseDouble(args[2]);
        int choice=4;
        switch(choice){
            case 1:System.out.println("Addition:"+(x+y+z));
                    break;
            case 2:System.out.println("Subtraction:"+(x-y-z));
                    break;
            case 3:System.out.println("Multiplication:"+(x*y*z));
                    break;
            case 4:System.out.println("Division:"+(x/y/z));
                    break;
            default:
                    System.out.println("Invalid Input");
        }
    }
}

/*
C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>javac que33.java   

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que33 10 20 30
Addition:60.0

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>javac que33.java    

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que33 10 20 30
Subtraction:-40.0

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>javac que33.java    

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que33 10 20 30
Multiplication:6000.0

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>javac que33.java    

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que33 10 20 30
Division:0.016666666666666666
*/