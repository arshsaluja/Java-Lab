class Player
{
public static void main(String args[])
{
cricket_player c=new cricket_player();
c.display();
football_player f= new football_player();
f.display();
hockey_player h=new hockey_player();
h.display();
}
}
class cricket_player extends Player
{
void display()
{
System.out.println("cricket");
}
}
class  football_player extends Player
{
void display()
{
System.out.println("football");
}
}
class hockey_player extends Player{
void display()
{
System.out.println("hockey");
}
}
