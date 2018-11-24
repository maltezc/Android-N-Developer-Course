
public class 3.37-Classes&Objects {
    public static void main(String[] args) {


        class Number {
            int score;
            public boolean isPositive() {
                if (score >= 0) {
                    return true;
                    //System.out.println("It is a positive number");
                } else {
                    return false;
                    //System.out.println("It is a negative number");
                }
            }
        }

        Number eval = new Number();
        eval.score = -5;
        System.out.println(eval.score);
        System.out.println(eval.isPositive());
        //class User {
        //	int score;
        //	public boolean hasWon() {
        //		if (score >= 100) {
        //			return true;
        //		} else {
        //			return false;
        //		}
        //	}
        //}
        //User chris = new User();
        //chris.score = 5;
        //System.out.println(chris.score);

//	User bob = new User();
//	bob.score = 100;
//	System.out.println(bob.score);
//	System.out.println(bob.hasWon());
    }
}

