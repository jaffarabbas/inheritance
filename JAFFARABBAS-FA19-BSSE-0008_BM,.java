
class booking
{
    private String bookingId;
   private String departureDate;
   private int numofrides;
   private double price;
   private String ridetype;
   private String totalfare;
   private String pikup;
   private String destination;



   public void getbookid(String bookingId)
   {
     this.bookingId =  bookingId;
   }

   public void getdepartureDate(String departureDate)
   {
     this.departureDate =  departureDate;
   }

   public void  getnumofrides()
   {
       this.numofrides= numofrides;
   }

   public void getprice()

   {
       this.price = price;
   }
   

   public void getridetype()

   {
       this.ridetype = ridetype;
   }

   public void gettotalfare()

   {
       this.totalfare = totalfare;
   }

   public void getpikup()

   {
       this.pikup = pikup;
   }

   public void getdestination()

   {
       this.destination = destination;
   }



   public String setbookid()
   {
        return this.bookingId;
   }

   public String setdepartureDate()
   {
        return this.departureDate;
   }

   public double  setnumofrides()
   {
       return this.numofrides;
   }

   public double setprice()

   {
       return this.price;
   }
   

   public String setridetype()

   {
       return this.ridetype;
   }

   public String settotalfare()

   {
      return this.totalfare;
   }

   public String setpikup()

   {
       return this.pikup;
   }

   public String setdestination()

   {
       return this.destination;
   }



   booking(String bookingId,String departureDate,int numofrides,double price,String ridetype,String totalfare,String pikup,String destination)
   {
            this.bookingId=bookingId;
            this.departureDate=departureDate;
            this.numofrides= numofrides;
            this.price = price;
            this.ridetype = ridetype;
            this.totalfare = totalfare;
            this.pikup = pikup;
            this.destination = destination;
   }



   public void total_price()
   {
       double total =  price*numofrides;
       System.out.println(total);
   }

   public void information()
   {
    System.out.println(bookingId);
    System.out.println(departureDate);
    System.out.println(numofrides);
    System.out.println(price);
    System.out.println(ridetype);
    System.out.println(totalfare);
    System.out.println(pikup);
    System.out.println(destination);
   }

}



class quiz
{
    public static void main(String[] args) {
        booking obj = new booking("rt", "1-2-2020", 3, 1000, "good", " nnull", "3 pm", "islambad");
        obj.total_price();
        obj.information();
    }
}