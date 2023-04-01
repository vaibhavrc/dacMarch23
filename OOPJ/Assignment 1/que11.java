import java.util.Scanner;
class que11{
    public static void main(String args[]){
        //Scanner sc= new Scanner(System.in);
        //System.out.println("Enter character:");
        char x=args[0].charAt(0);
        if ((((int)x)<48)||(((int)x)>122)){
            System.out.println("Invalid Input");
        }
        else if ((((int)x)>=48)&&(((int)x)<=57)){
            System.out.println("Digit:"+((int)x));
        }
        else if ((((int)x)>=65)&&(((int)x)<=90)){
            char y=Character.toLowerCase(x);
            System.out.println("New Character:"+y+" Codepoint:"+((int)x));
        }
        else if ((((int)x)>=97)&&(((int)x)<=122)){
            char z=Character.toUpperCase(x);
            System.out.println("New Character:"+z+" Codepoint:"+((int)x));

        }
    }
}

/*
C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que11 Abc   
New Character:a Codepoint:65

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que11 123 
Digit:49

C:\Users\Vaibhav\Documents\CDAC\Java\OOPJ\Assignment 1>java que11 abc 
New Character:A Codepoint:97
*/