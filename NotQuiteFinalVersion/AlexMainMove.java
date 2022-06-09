import java.util.*;
import java.awt.*;
import javax.swing.*;

//test comment
public class AlexMainMove {

   public static void main(String[] args) {      
      Window window = new Window();
   
   
      boolean endgame = false;
      
      Board board = new Board(10);
      
      Hero hero = new Hero();
      HeroJLabel heroJ = new HeroJLabel();
      
      //right now manually adding enemies
      Enemy mob = new Enemy(200, 2, 3);
      Enemy mob1 = new Enemy(200, 4, 3);
      Enemy furthestMob = new Enemy(200, 20, 20);
      Enemy chest = new Enemy(200, 5, 3);
      chest.setChestLabel();
      
      
      EnemyPosHeap enemyHeap = new EnemyPosHeap(4, furthestMob);
      enemyHeap.insert(mob);
      enemyHeap.insert(mob1);
      enemyHeap.insert(chest);
   
      
      // Initializes new board
      char action = 'n';
      if (action == 'n') {
      
         Board.populateEmptyBoard(board, mob, mob1, chest);
      
      }
   
      window.UpdateFrame();
      
      //Player actions
      while (!endgame) {
         System.out.println("w - up\ns - down\na - left\nd - Right\nx - attack");
      
         Scanner input = new Scanner(System.in);
         action = input.next().charAt(0);
      
         if (action == 'w'){
         
            Hero.movePlayer("w");
            
         } else if (action == 's'){
         
            Hero.movePlayer("s");       
            
         } else if (action == 'a'){
         
            Hero.movePlayer("a");       
         
         } else if (action == 'd'){
         
            Hero.movePlayer("d");       
         
         } else if (action == 'x'){
         
            System.out.println("Heavy?(enter \"h\") or light attack (enter \"l\"?");
            String attack = input.next();
            mob.setHealthEnemy(attack);
            System.out.println("Enemy health = " + mob.getHealthEnemy());
            
         } else {
         
            System.out.println("Invalid Command");
            
         }
         mob.enemyMove(mob);
         mob1.enemyMove(mob1);
         enemyHeap.reHeap();
         enemyHeap.printClosestEnemy();
         
      }
   }
}