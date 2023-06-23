public class CalculateServise {

    
    public void Calculate(String Operetor ,double operend1 ,double operend2 ){

        switch (Operetor){

            case"+":
                CalculateAddition calculateAddition = new CalculateAddition();
				calculateAddition.getCalculateValue(operend1,operend2);
                System.out.println(operend1+" + "+operend2+"=" + calculateAddition.getCalculateValue(operend1,operend2));

                break;
            case "-":
                CalculateSubtraction calculateSubtraction = new CalculateSubtraction();
               calculateSubtraction.getCalculateValue(operend1,operend2);
			   System.out.println(operend1+" - "+operend2+"=" + calculateSubtraction.getCalculateValue(operend1,operend2));
                break;
            case "*":
                CalculateMultiplication calculateMultiplication = new CalculateMultiplication();
                calculateMultiplication.getCalculateValue(operend1,operend2);
				System.out.println(operend1+" * "+operend2+" = " + calculateMultiplication.getCalculateValue(operend1,operend2));
                break;
            case "/":
                CalculateDivision calculateDivision = new CalculateDivision();
                calculateDivision.getCalculateValue(operend1,operend2);
				System.out.println(operend1+" /"+operend2+" =" + calculateDivision.getCalculateValue(operend1,operend2));


        }
    }
}