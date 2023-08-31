package Hashmapmenudirvenprogram;


import Hashmapmenudirvenprogram.HashMapMethods;

import java.util.*;


    public class MainClass {
        public static void main(String[] args) {


            Scanner scanner=new Scanner(System.in);
            HashMapMethods hashMapMethods=new HashMapMethods();
            int choice=(-1);

            while(true){
                System.out.println("1-Add data, 2-Display All Data, 3-Find in Data, 4-Delete a Data, " +
                        "5-Replace/Update Data, 6-Delete All Data, 0-Exit");
                System.out.println("Enter your choice=");
                choice=scanner.nextInt();

                switch(choice){

                    case 1:
                        System.out.println("Enter a Rto Code");
                        int RTO=  scanner.nextInt();
                        System.out.println("Enter a City Name");
                        String CITY=scanner.next();
                        hashMapMethods.addNew(RTO,CITY);
                        break;
                    case 2:
                        System.out.println("Display the city and Rto Code");
                        hashMapMethods.displayAllData();
                        break;
                    case 3:System.out.println("Enter a Rto Code");
                        RTO=  scanner.nextInt();
                        hashMapMethods.findCity(scanner.nextInt());
                        break;
                    case 4:
                        System.out.println("Enter a Rto Code");
                        RTO=  scanner.nextInt();
                        hashMapMethods.deleteData(scanner.nextInt());
                        break;
                    case 5: System.out.println("Enter a Rto Code");
                        RTO=  scanner.nextInt();
                        System.out.println("Enter a City Name");
                        CITY=scanner.next();
                        hashMapMethods.updateData(scanner.nextInt(), scanner.next());
                        break;
                    case 6:
                        hashMapMethods.clearAllData();
                        System.out.println("Delete all");
                        break;
                    case 0:
                        return;
                }
            }

        }
    }

