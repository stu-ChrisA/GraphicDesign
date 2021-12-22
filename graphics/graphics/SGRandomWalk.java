public class SGRandomWalk 
{
    public static void main(String[]args)
    {
        //Add two Ellipses one is circle other is person
        // Person is fill with color
        // generate random detla x and y in range of -10 to 10
        // Starting coords at (150,150)
        Rectangle bg = new Rectangle(0,0,300,300);
        bg.setColor(Color.BLUE);
        bg.draw();
        bg.fill();
        Ellipse egg = new Ellipse(50,50,200,200);
        egg.draw();
        Ellipse person = new Ellipse(150,150,10,10);
        person.draw();
        person.setColor(Color.RED);
        person.fill();

        int steps = 0;
        
        while(Math.sqrt(Math.pow(person.getX() - 150,2) + Math.pow(person.getY() - 150,2)) < 100)
        {
            int deltaX = (int)(Math.random() * (21) + -10);
            int deltaY = (int)(Math.random() * (21) + -10);
            steps++;
             //pause for ¼ sec
             try { Thread.sleep(100);}
             catch(Exception ex) {};
            person.translate(deltaX,deltaY);
        }

        System.out.println(steps);





    }
    
}
