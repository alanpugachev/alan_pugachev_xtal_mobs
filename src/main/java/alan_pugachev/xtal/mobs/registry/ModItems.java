package alan_pugachev.xtal.mobs.registry;

import alan_pugachev.xtal.mobs.XtalMobs;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item XTAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    //block items
    public static final BlockItem XTAL_BLOCK = new BlockItem(ModBlocks.XTAL_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(XtalMobs.MOD_ID, "xtal"), XTAL);
        Registry.register(Registry.ITEM, new Identifier(XtalMobs.MOD_ID, "xtal_block"), XTAL_BLOCK);
    }
}
