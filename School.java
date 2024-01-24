public class School {

     public void add ( int x , int y){

         int z = x + y;

         System.out.println( z);
     }

     public double add ( double x, double y){

         System.out.println( " The sum is  " + x+y);
         return x + y;
     }

    public static void main(String[] args) {
        School s = new School();
        s.add(5,7);
        s.add(5.4,6.7);
       // more precious
    }

}