class Main{


  //If
 public static void main(String[] args){

  int numberIf = 2;

   if (numberIf < 0){
     System.out.println("A variable" + numberIf +  "is a negative number");
  }else if (numberIf > 0){
     System.out.println("A variable" +  numberIf  + "is a positive number");
  } else {
     System.out.println("NAN");
  }


   //while
   int numberWhile = 0;

   while (numberWhile < 3){
     numberWhile ++;
     System.out.println("The variable is equivalent to " + numberWhile);
   }

//Do While
   int numDoWhile = 1;

   do{
     numDoWhile++;
     System.out.println("The numDoWhile is now valid as " + numDoWhile);
   }while(numDoWhile < 3);
 
 
  //For
  for(int numberFor = 0; numberFor <= 3; numberFor++){
  System.out.println("The numberFor is now valid as " + numberFor);
  }

   //Switch 

   var season = "Spring";

   switch(season){
     case "Spring":
       System.out.println("The season is a Spring");
     break;
     case "Summer":
       System.out.println("The season is a Summer");
     break;
     case "Autumn" :
       System.out.println("The season is a Autumn");
     break;
     case "Winter" :
       System.out.println("The season is winter");
     default:
       System.out.println(season);
   }
 }


}