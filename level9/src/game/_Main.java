package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Main {
	public static void main(String[] args) {
		Swordman r_swordman1 = new Swordman(Side.RED);
        Knight r_knight1 = new Knight(Side.RED);
        Knight r_knight2 = new Knight(Side.RED);
        MagicKnight r_magicKnight1 = new MagicKnight(Side.RED);

        Knight b_knight1 = new Knight(Side.BLUE);
        MagicKnight b_magicKnight1 = new MagicKnight(Side.BLUE);
        MagicKnight b_magicKnight2 = new MagicKnight(Side.BLUE);

        Horse<Swordman> black = new Horse<>(40);
        Horse<Knight> white = new Horse<>(50);

        black.setRider(r_swordman1); 
        white.setRider(b_magicKnight1);
        
        System.out.println("---------");
  
        List<Unit> redTeam =  new ArrayList<> (Arrays.asList(r_swordman1,r_knight1,r_knight2,r_magicKnight1));
        List<Unit> blueTeam =  new ArrayList<> (Arrays.asList(b_knight1,b_magicKnight1,b_magicKnight2));
        
        for(Unit u : redTeam) {
        	System.out.println(u);
        }
        for(Unit u : blueTeam) {
        	System.out.println(u);
        }
        
        System.out.println("---------");
    
        r_swordman1.defaultAttack(b_knight1); 
        r_knight1.defaultAttack(b_magicKnight1);
        r_knight2.switchWeapon();
        r_knight2.defaultAttack(b_magicKnight2);

        b_magicKnight1.defaultAttack(r_swordman1);
        b_magicKnight2.lighteningAttack(new Unit[] {
                r_knight1,
                r_knight2,
                r_magicKnight1
        });
        
        
        
        
	}
}
