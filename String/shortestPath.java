package String;

public class shortestPath {
    public static void fn(String path){
        int x=0,y=0;

        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);

            if(dir=='S'){
                y--;
            } else if(dir=='N'){
                y++;
            }
            else if(dir =='W'){
                x--;
            } else{
                x++;
            }
        }

        int x2= x*x;
        int y2=y*y;

        double shortestDistance = Math.sqrt(x2 + y2);
        
        System.out.println("The shortest distance is: " + shortestDistance);
    }

    public static void main(String[] args) {
        // Test with a sample path
        String path = "WNEENESENNN"; // Example input
        fn(path);
    }
}
