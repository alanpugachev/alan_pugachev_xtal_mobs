package alan_pugachev.xtal.mobs;

import alan_pugachev.xtal.mobs.registry.ModBlocks;
import alan_pugachev.xtal.mobs.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class XtalMobs implements ModInitializer {

	public static final String MOD_ID = "xtalmobs";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
