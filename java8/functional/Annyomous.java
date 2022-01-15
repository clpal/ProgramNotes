package java8.functional;
@FunctionalInterface
public interface Annyomous {

 int  printdata(int a,int b);
  static   void  show(){

   }
   default   int display(int x,int y){
      return  10;
   }
   static   void  show1(){

   }
   default   int display1(int x){
      return  10;
   }

}
