
class one 
{
       void c1()
       {
           System.out.println("dsjgfkjsdgfkjsdgfkjgsdjkfgsdjgfjsdgfjhsd");
       }
}
class two extends one
{
    
       void c2()
       {
         c1();
           System.out.println("sfsdfsdf");
       }
}
class three extends two
{
       void c3()
       {
        c2();
        System.out.println("my jaffar");
       }
}

class multilevel
{
    public static void main(String[] args) {
        three obj = new three();
        obj.c3();
    }
}