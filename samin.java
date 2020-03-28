
class bookorder extends user
{
    public int total;
   
    void bookordr()
   {
         int price = 10000;
         total = this.book*price;
         System.out.println(total);
         if(price <= 10000)
         {
             System.out.println("total price : "+total);
            discount();
         }
         else{
            simple();
         }
   }

   void details()
   {
           this.user_name="samin";
           this.book=3;
           this.cell= "032132124";

           System.out.println("Name : "+this.user_name+"\nBook Quality: "+this.book+"\n Cell : "+this.cell);
   }

   void discount()
   {
       float dis =  total*0.05f;

       float res = total - dis;

       System.out.println("Discount 5% : "+res);
   }

   void simple()
   {
    float res = total;
    System.out.println("Total : "+res);
   }

}

class user 
{
      String user_name;
      int book=3;
      String cell = "032132124";
}


class samin
{
    public static void main(String[] args) {
        bookorder obj =  new bookorder();
        obj.details();
        obj.bookordr();
    }
}