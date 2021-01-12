/*
Description: This sketch print my initials within nine rows
Created By: Salweyar Patel
Due Date: November 14, 2018
Course: COMP-1029
*/

String name = Ask.forString("What is your name:");
int number1 = Ask.forInt("Enter your first programming logic test score (in whole number):");
double number2 = Ask.forDouble("Enter your last programming logic test score (Double):");
 
println(name);
          if(number2<50){
               println("you fail the course");
         
         if(number1>number2){
               println("It's seems like you are not working hard lately.");
    }
      }
         else{
               println("Awesome keep up with your good work!");
    }
 
String grade1 = Ask.forString("What is your overall grade (A,A+,B,B+,C,C+,D,D+,F):");
int grade2 = Ask.forInt("What is your overall grade (in whole number):");

 println("Hi, "+name+". Nice to meet you.");

 println("grade1");
    if(grade2>50){
        println("Congratulation you passed the course");
   }
    else{
        println("I regret to say this but you have to take the course again");
   }



 
