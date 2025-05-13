public class App {
    public static void main (String[] args) throws Exception{
        // conditionals
        int age = 23;
        
        if(age > 18){
            System.out.println("Enter!");
        } 
        else if (age == 18){
            System.out.println("Almost there!");
        }
        else{
            System.out.println("Byebye");
        }

        // string comparison
        String name = "Andrea";
        // if (name == "Andrea"){  this could be used but equals is recommended
        if (name.equals("Andrea")){
            System.out.println("Hi Andrea");
        }
        else{
            System.out.println("You shall not pass!");
        }

        // FOR loops
        System.out.println("Increasing for loop");
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("Decreasing for loop");
        for(int i=10; i>0; i--){
            System.out.println(i);
        }

        //acumulador
        int j = 0;
        for(int i=0; i<10; i++){
            j++;
        }
        System.out.println("Final value of j="+j);
    }
    
}
