import java.util.Scanner;

public class Practice {

   public static void main(String[] args) {
      Matriz();
   }

   static void FizzBuzz() {
      new Scanner(System.in);
      System.out.println("Imma give you fizz for every multiple of 3, buzz for every of 5, and fizzbuzz for every of 15");

      for(int i = 1; i <= 100; ++i) {
         if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
            System.out.println("Fizz");
         } else if (i % 5 == 0) {
            System.out.println("Buzz");
         } else {
            System.out.println(i);
         }
      }

   }

   static void Factorial() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("Give me a number and I will give you its factorial");
      int numero = myobj.nextInt();

      for(int i = numero - 1; i >= 2; --i) {
         numero *= i;
         System.out.println(numero);
      }

   }

   static void GuessNumber() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("Guess the number");
      int Guess = myobj.nextInt();
      int number = (int)(Math.random() * 101.0);

      do {
         if (Guess > number) {
            System.out.println("Your guess is higher than the actual number");
            System.out.println("Guess the number");
            Guess = myobj.nextInt();
         } else if (Guess < number) {
            System.out.println("Your guess is lower than the actual number");
            System.out.println("Guess the number");
            Guess = myobj.nextInt();
         } else {
            System.out.println("fuck you");
         }
      } while(Guess != number);

      System.out.println("You guessed it.");
   }

   static void Calculator() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("What operation do you wanna do?");
      System.out.println("1.Suma\n2.Resta\n3.Multiplication\n4.Division\n5.Square root\n6.Exponents");
      int Operation = myobj.nextInt();
      int FirstNumber;
      int SecondNumber;
      switch (Operation) {
         case 1:
            FirstNumber = number1();
            SecondNumber = number2();
            Suma(FirstNumber, SecondNumber);
            break;
         case 2:
            FirstNumber = number1();
            SecondNumber = number2();
            Resta(FirstNumber, SecondNumber);
            break;
         case 3:
            FirstNumber = number1();
            SecondNumber = number2();
            Multiplication(FirstNumber, SecondNumber);
            break;
         case 4:
            FirstNumber = number1();
            SecondNumber = number2();
            Division(FirstNumber, SecondNumber);
            break;
         case 5:
            FirstNumber = number1();
            Root(FirstNumber);
            break;
         case 6:
            FirstNumber = number1();
            SecondNumber = number2();
            Exponent(FirstNumber, SecondNumber);
            break;
         default:
            System.out.println("Incorrect operator.");
            Calculator();
      }

   }

   public static void Suma(int FirstNumber, int SecondNumber) {
      int TotalNumber = FirstNumber + SecondNumber;
      System.out.println(TotalNumber);
   }

   public static void Resta(int FirstNumber, int SecondNumber) {
      int TotalNumber = FirstNumber - SecondNumber;
      System.out.println(TotalNumber);
   }

   public static void Multiplication(int FirstNumber, int SecondNumber) {
      int TotalNumber = FirstNumber * SecondNumber;
      System.out.println(TotalNumber);
   }

   public static void Division(int FirstNumber, int SecondNumber) {
      int TotalNumber = FirstNumber / SecondNumber;
      System.out.println(TotalNumber);
   }

   public static void Root(int FirstNumber) {
      int Square_Root = (int)Math.sqrt((double)FirstNumber);
      System.out.println(Square_Root);
   }

   public static void Exponent(int FirstNumber, int SecondNumber) {
      int TotalNumber = (int)Math.pow((double)FirstNumber, (double)SecondNumber);
      System.out.println(TotalNumber);
   }

   static int number1() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("What's the first number?");
      int FirstNumber = myobj.nextInt();
      return FirstNumber;
   }

   static int number2() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("What's the second number?");
      int SecondNumber = myobj.nextInt();
      return SecondNumber;
   }

   static void Zodiac() {
      String Month = month();
      int day = day();
      switch (Month) {
         case "january":
            if (day >= 1 && day <= 19) {
               System.out.println("Your zodiac sign is Capricornio.");
            } else if (day >= 20 && day <= 31) {
               System.out.println("Your zodiac sign is Acuario.");
            }
            break;
         case "february":
            if (day >= 1 && day <= 18) {
               System.out.println("Your zodiac sign is Acuario.");
            } else if (day >= 19 && day <= 28) {
               System.out.println("Your zodiac sign is Piscis");
            }
            break;
         case "march":
            if (day >= 1 && day <= 20) {
               System.out.println("Your zodiac sign is Piscis");
            } else if (day >= 21 && day <= 31) {
               System.out.println("Your zodiac sign is Aries");
            }
            break;
         case "april":
            if (day >= 1 && day <= 19) {
               System.out.println("Your zodiac sign is Aries");
            } else if (day >= 20 && day <= 30) {
               System.out.println("Your zodiac sign is Tauro");
            }
            break;
         case "may":
            if (day >= 1 && day <= 20) {
               System.out.println("Your zodiac sign is Tauro");
            } else if (day >= 21 && day <= 31) {
               System.out.println("Your zodiac sign is Geminis");
            }
            break;
         case "june":
            if (day >= 1 && day <= 20) {
               System.out.println("Your zodiac sign is Geminis");
            } else if (day >= 21 && day <= 30) {
               System.out.println("Your zodiac sign is Cancer");
            }
            break;
         case "july":
            if (day >= 1 && day <= 22) {
               System.out.println("Your zodiac sign is Cancer");
            } else if (day >= 23 && day <= 31) {
               System.out.println("Your zodiac sign is Leo");
            }
            break;
         case "august":
            if (day >= 1 && day <= 22) {
               System.out.println("Your zodiac sign is Leo");
            } else if (day >= 23 && day <= 31) {
               System.out.println("Your zodiac sign is Virgo");
            }
            break;
         case "september":
            if (day >= 1 && day <= 22) {
               System.out.println("Your zodiac sign is Virgo");
            } else if (day >= 23 && day <= 30) {
               System.out.println("Your zodiac sign is Libra");
            }
            break;
         case "october":
            if (day >= 1 && day <= 22) {
               System.out.println("Your zodiac sign is Libra");
            } else if (day >= 23 && day <= 31) {
               System.out.println("Your zodiac sign is Escorpio");
            }
            break;
         case "november":
            if (day >= 1 && day <= 21) {
               System.out.println("Your zodiac sign is Escorpio");
            } else if (day >= 22 && day <= 30) {
               System.out.println("Your zodiac sign is Sagitario");
            }
            break;
         case "december":
            if (day >= 1 && day <= 21) {
               System.out.println("Your zodiac sign is Sagitario");
            } else if (day >= 22 && day <= 31) {
               System.out.println("Your zodiac sign is Capricornio");
            }
            break;
         default:
            System.out.println("Invalid response.");
      }

   }

   static String month() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("What month did you were born in?");
      String Month = myobj.next().toLowerCase();
      return Month;
   }

   static int day() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("What day did you were born in?");
      int Day = myobj.nextInt();
      if (Day >= 1 && Day <= 31) {
         return Day;
      } else {
         System.out.println("Invalid response.");
         Zodiac();
         return Day;
      }
   }

   static void Matriz() {
      Scanner myObj = new Scanner(System.in);
      int row;
      int column;
      int Operator;
      
      do{ 
         System.out.println();
         System.out.println("What operator do you want to use?");
         System.out.println("1.Diagonal\n2.Toda la matriz\n3.Primera columna y ultima\n4.Primera y ultima fila\n5.Primera fila y ultima columna\n6.Primera columna y ultima fila\n7.Matriz completa y sumatoria\n8.Matriz completa y suma de diagonal\n9.Matriz al cuadrado\n10.Salir");
         Operator = myObj.nextInt();
         switch(Operator){

            case 1:
            row = row();
            column = column();
            Diagonal(row, column);
   
            break;
   
            case 2:
            row = row();
            column = column();
            TodaLaMatriz(row, column);
            break;
   
            case 3:
            row = row();
            column = column();
            PrimeraColumnaYUltima(row, column);
            break;
   
   
            case 4:
            row = row();
            column = column();
            PrimeraFilaYUltima(row, column);
            break;
   
            case 5:
            row= row();
            column = column();
            PrimeraFilaYUltimaColumna(row, column);
            break;
   
            case 6:
            row = row();
            column = column();
            PrimeraColumnaYUltimaFila(row, column);
            break;
   
            case 7:
            row = row();
            column = column();
            MatrizYSumatoria(row, column);
            break;
   
            case 8:
            row = row();
            column = column();
            MatrizYSumatoriaDiagonal(row, column);
            break;
   
            case 9:
            row = row();
            column = column();
            MatrizCuadrado(row, column);
            break;



   
            default:
            System.out.println();
            System.out.println("You exited the program");
            break;
   
   
   
         }   
   
      
      } while(Operator >= 1 && Operator <= 9);
   }
      

   public static void Diagonal(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i<column;i++){
         for(int j = 0; j < row; j++){
            if(column == row){
               if(i==j){
               matriz[i][j] = (int)(Math.random()*10);
               }
            }
         }
      }

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
   }

   public static void PrimeraFilaYUltima(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column == row || column != row){
               matriz[0][j] = (int)(Math.random()*11);
               matriz[row-1][j] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
   }

   public static void PrimeraFilaYUltimaColumna(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column == row || column != row){
               matriz[0][j] = (int)(Math.random()*11);
               matriz[i][row-1] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
   }

   public static void TodaLaMatriz(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column == row || column != row){
               matriz[i][j] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
   }

   public static void PrimeraColumnaYUltima(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column == row || column != row){
               matriz[i][0] = (int)(Math.random()*11);
               matriz[i][column-1] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
   }

   public static void PrimeraColumnaYUltimaFila(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column == row || column != row){
               matriz[i][0] = (int)(Math.random()*11);
               matriz[row-1][j] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
   }

   public static void MatrizYSumatoria(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column != row){
               matriz[i][j] = (int)(Math.random()*11);

               
            } else if( column == row){
               matriz[i][j] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
      int sum = sumOfNumbers(matriz);
      System.out.println("Sum of all matriz elements is: " + sum);
   }

   public static void MatrizYSumatoriaDiagonal(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; i++){
         for(int j = 0; j < row; j++){
            if(column != row){
               matriz[i][j] = (int)(Math.random()*11);

               
            } else if( column == row){
               matriz[i][j] = (int)(Math.random()*11);
            }
         }
      } 

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");

         }

         System.out.println();
      }
      int sum = sumOfNumbersdiagonal(matriz);
      System.out.println("Sum of all matriz elements is: " + sum);
   }

   public static void MatrizCuadrado(int row, int column){
      int[][] matriz = new int[column][row];

      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            if (column == row || column != row) {
               matriz[i][j] = (int)(Math.random() * 11.0);
            }
               
         }
         
      }

      System.out.println();
      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print(matriz[i][j] + " ");
         }

         System.out.println();
         
      }

      

      System.out.println();
      for(int i = 0; i < column; ++i) {
         for(int j = 0; j < row; ++j) {
            System.out.print((int)(Math.pow(matriz[i][j], 2))+ " ");
         }

         System.out.println();
         
      }
   }

   public static int sumOfNumbers(int[][] matriz){

      int sum = 0;
      for(int i = 0; i<matriz.length;i++){

         for(int j = 0; j<matriz.length;j++){
            sum += matriz[i][j];
            
         }

      }
      return sum;

   }

   public static int sumOfNumbersdiagonal(int[][] matriz){

      int sum1 = 0;
      for(int i = 0; i<matriz.length;i++){

         for(int j = 0; j<matriz.length;j++){

            if(i==j){
               sum1 += matriz[i][j];
            }
            
         }

      }
      return sum1;

   }

   static int row() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("Of how many rows do you want your matriz?");
      int rows = myobj.nextInt();
      return rows;
   }

   static int column() {
      Scanner myobj = new Scanner(System.in);
      System.out.println("Of how many column do you want your matriz?");
      int column = myobj.nextInt();
      return column;
   }

   //Probando github dentro de Java
}