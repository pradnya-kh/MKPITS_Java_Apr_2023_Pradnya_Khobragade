public class Main {
    public static void main(String[] args)
    {

        //by changing number of of parameter overloading
        OVERLOADING add=new OVERLOADING();
       int sum =add.Addition(12,30);
       int sumfirst=add.Addition(12,2,50);

        System.out.println(sum);
        System.out.println(sumfirst);

        //overloading changing datatype
        OverloadingSubtraction sub=new OverloadingSubtraction();
        int  subfirst=sub.Subtraction(20,5);
        double subsecond=sub.Subtraction(20.5,2.3);
        System.out.println(subfirst);
        System.out.println(subsecond);

        //overloading subtraction no of parameter
        OverloadingSubtrationnoofParameter subnew=new OverloadingSubtrationnoofParameter();
        int subtwo=subnew.SubtractionOne(20,20,20);
        int subthree=subnew.SubtractionOne(30,30);
        System.out.println(subtwo);
        System.out.println(subthree);

        //overloading area of Rectangle
        AreaofRectangle Rectanglenew=new AreaofRectangle();
        int Rectangleone=Rectanglenew.Rectangle(10,20);
        double Rectangletwo=Rectanglenew.Rectangle(10.5, 20.5);
        System.out.println(Rectangleone);
        System.out.println(Rectangletwo);

       //addition with different datatypes
        AdditiondiffDatatype addone=new AdditiondiffDatatype();
        int addofint =addone.Additionone(12,30);
        double addofdouble=addone.Additionone(20.5,30.5,40.5);

        System.out.println(addofint);
        System.out.println(addofdouble);

        //calculator//
        Calculator calculator = new Calculator();

        int sum1 = calculator.cal(5, 10);
        System.out.println("Sum 1: " + sum1);

        double sum2 = calculator.cal(2.5, 3.7);
        System.out.println("Sum 2: " + sum2);

        int sum3 = calculator.cal(1, 2, 3);
        System.out.println("Sum 3: " + sum3);

        //messageSendwr//
     MessageSender messageSender = new MessageSender();

     messageSender.sendMessage("Hello", "Riya");
     messageSender.sendMessage("Meeting reminder", "Rita", "Email");
     messageSender.sendMessage("Party invitation", "tina", "SMS", "attachment.pdf");

     //Recipe//
       Recipe recipe = new Recipe();

       recipe.cook();
       recipe.cook("Chicken");
       recipe.cook("Beef", "Potatoes");
       recipe.cook("Fish", "Lemon", "Grill for 15 minutes");


       //Transportation//
                Transportation transportation = new Transportation();

                transportation.travel(100);
                transportation.travel(200, 3);
                transportation.travel(150, 500.0);
                transportation.travel(300, 2, 1000.0);



            //BankAccount//
                BankAccount account = new BankAccount();

                account.deposit(1000.0);
                account.withdraw(500.0);
                account.transfer(200.0, "RecipientAccount");
            }
        }







    //