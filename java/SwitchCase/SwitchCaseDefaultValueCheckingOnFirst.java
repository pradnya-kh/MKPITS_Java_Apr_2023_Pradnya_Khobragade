public class SwitchCaseDefaultValueCheckingOnFirst {


        public static  void main(String[] args){
            int name = 8;
            switch (name) {
                default:
                    System.out.println("Not found");
                    break;

                case 1:
                    System.out.println("This is student First");
                    break;
                case 2:
                    System.out.println("This is Student Second");
                    break;
                case 3:
                    System.out.println("This is Student third");
                    break;


                case 4:
                    System.out.println("This is Student Fourth");
                    break;
                case 5:
                    System.out.println("This is Student fifth");
                    break;
                case 6:
                    System.out.println("This is Student Sixth");
                    break;
                case 7:
                    System.out.println("This is Student Seventh");
                    break;
            }
        }
    }