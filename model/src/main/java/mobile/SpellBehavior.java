package mobile;

import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.ISpell;
import contract.IStrategy;
import model.LorannWorldEntity;

public class SpellBehavior  implements IStrategy {
	
	public ISpell animate( final IMobile motion, final ILorannWorldEntity lorannWorldEntity, final int x, final int y){
		
		motion.savePosition();
		
		if(!motion.executeMoveIfPossible(motion.getX() - lorannWorldEntity.getHero().getXSpell(), motion.getY() - lorannWorldEntity.getHero().getYSpell())){
			lorannWorldEntity.getHero().setXSpell(-lorannWorldEntity.getHero().getXSpell());
			lorannWorldEntity.getHero().setYSpell(-lorannWorldEntity.getHero().getYSpell());
		}
	   return null;
	}
	
	
}
