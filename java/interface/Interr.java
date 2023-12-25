
    interface one{
        double pi=3.14;
    }
    interface two{
        double radius=10.0;
    }
    interface three{
        double area();
        }
    
    class circle implements one,two,three{
        public double area(){
            return pi*radius*radius;
        }  
      }
      class Interr{
        public static void main(String args[]){
            circle c=new circle();
           System.out.println(c.area());

        }

      }
       